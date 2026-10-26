import java.util.Scanner;

public class IT26102539LAB4Q2 {
    public static void main(String [] args ) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter Exam Marks(out of 100): ");
		double exmMarks = input.nextDouble();
		
		if (exmMarks < 0 || exmMarks > 100){
			System.out.print("Invalid Input For Exam Marks. Terminating Program");
			return;
		}
		
		System.out.print("Please Enter Lab Submission Marks(out of 100): ");
		double labMarks = input.nextDouble();
		
		if (labMarks < 0 || labMarks > 100){
			System.out.print("Invalid Input For Lab Percentage. Terminating Program");
			return;
		}
		
		System.out.print("Please Enter Percentage Given For The Exam: ");
		double exmPercentage = input.nextDouble();
		
		if (exmPercentage < 0 || exmPercentage > 100){
			System.out.print("Invalid Input For Exam Percentage. Terminating Program");
			return;
		}
		
		System.out.print("Please Enter Percentage Given For The Lab Submission: ");
		double labPercentage = input.nextDouble();
		
		if (labPercentage < 0 || labPercentage > 100){
			System.out.print("Invalid Input For Lab Percentage. Terminating Program");
			return;
		}
		
		double finalMarks = (exmMarks * exmPercentage / 100) + (labMarks * labPercentage / 100);
		
		System.out.println("Final Exam Mark Is :" + finalMarks);
		}

	}