import java.util.Scanner;

public class IT26102576Lab4Q2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter exam marks(out of 100): ");
		double marksExam = input.nextDouble();
		
		if(marksExam < 0 || marksExam > 100){
			
			System.out.println("Invalid input for exam marks. Terminating the program");
			return;	
		}
		
		
		System.out.print("Please enter lab submission marks (out of 100): ");
		double marksLab = input.nextDouble();
		
		if(marksLab < 0 || marksLab > 100){
			
			System.out.println("Invalid input for lab submission marks. Terminating the program");
			return;	
		}
		
		
		System.out.print("Please enter percentage given for exam: ");
		double percentageExam = input.nextDouble();
		
		if(percentageExam < 0 || percentageExam > 100){
			
			System.out.println("Invalid input for exam percentage. Terminating the program");
			return;
		}
		
		
		System.out.print("Please enter percentage given for lab submission: ");
		double percentageLab = input.nextDouble();
		
		if(percentageExam + percentageLab != 100){
			
			System.out.println("The percentage must add up to the 100. Terminating program");
			return;
		}
		
		
		double marksfinal = (marksExam * percentageExam/100) + (marksLab * percentageExam/100);
		System.out.println("Final Exam Mark is: " + marksfinal );
	}
}	
		
		
		
		
		
	
			
			
		