import java.util.Scanner;

public class IT26102440Lab4Q2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		double examMark;
		double labMark;
		double examPercentage;
		double labPercentage;
		double finalMark;
		
		System.out.print("Please enter exam marks (out of 100); ");
		examMark = input.nextDouble();
		
		if (examMark < 0 || examMark > 100){
			System.out.println("Invalid input for exam marks. Terminating program. ");
			return;
		}
		
		System.out.print("Please enter lab submision marks (out of 100):");
		labMark = input.nextDouble();
		
		if(examPercentage + labPercentage!= 100){
			System.out.println("The percentages must add up to 100. Terminating program.");
			return
		}
		
		finalMark = 
			(examMark * examPercentage / 100)
			+
			(labMark * labPercentage / 100);
			
		System.out.println("Final Exam Mark is : " + finalMark);
		
	}
}