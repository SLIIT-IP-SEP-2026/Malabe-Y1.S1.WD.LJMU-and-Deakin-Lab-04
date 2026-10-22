import java.util.Scanner;

public class IT26102620Lab4Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Exam Marks: ");
		double examMarks = input.nextDouble();
		
		System.out.print("Enter the Lab Submission Marks: ");
		double labMarks = input.nextDouble();
		
		if (examMarks < 0 || examMarks > 100){
			System.out.println("Invalid exam mark. Terminating.");
			return;
		}	
		
		if (labMarks < 0 || labMarks > 100){
			System.out.println("Invalid lab submission mark. Terminating.");
			return;
		}	
			
		System.out.print("Enter the percentage given for the Exam: ");
		double examPercentage = input.nextDouble();
		
		System.out.print("Enter the percentage given for the Lab: ");
		double labPercentage = input.nextDouble();
		
		if (examPercentage + labPercentage != 100){
			System.out.println("The percentage must add upto 100. Terminating program.");
			return;
		}
		
		double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
		 System.out.println("Final exam Mark is: " + finalMark);
		
		}
	}	
	

			
		