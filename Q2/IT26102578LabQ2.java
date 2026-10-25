import java.util.Scanner;
public class IT26102578LabQ2{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Type the Final Exam Marks : ");
		System.out.print("Type the Lab Submission Marks : ");
		System.out.print("Type the percentage amount for Final Exam : ");
		System.out.print("Type the percentage for the Lab Submission : ");
		double examF = input.nextDouble();
		double mSub = input.nextDouble();
		double fPer = input.nextDouble();
		double sPer = input.nextDouble();
		
		if (examF < 0 || examF >100){
			System.out.println(" The Marks are invalid , Program terminated );
			return;
		}
		
		if (mSub < 0 || examF >100){
			System.out.println(" The Marks are invalid , Program terminated );
			return;
		}
		
		if ( fPer + sPer != 100){
			System.out.println("The Percentages should add up to 100 ");
			return;
		}
		
		double fExam = (examF*fPer/100)+(mSub*sPer/100);
		System.out.println("Final Exam marks are " +fExam " : ");
		
		input.close();
	}
	
}
		
		
		
		
		
		
			
			
		
		
		
		