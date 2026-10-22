import java.util.Scanner;

public class IT26102661Lab4Q2{
	
	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter exam marks (out of 100): ");
		int examMarks = input.nextInt();
		
		System.out.print("Please enter lab submission marks (out of 100): ");
		int labMarks = input.nextInt();
		
		System.out.print("Please enter percentage given for the exam: ");
		double percentageOfExam = input.nextDouble();
		
		System.out.print("Please enter percentage given for the lab submission: ");
		double percentageOfLab = input.nextDouble();
		
		if (examMarks < 0 || examMarks > 100) {
			System.out.println("Invalid input for exam marks. Terminating program.");
			return;
		}
		if (labMarks < 0 || labMarks > 100) {
			System.out.println("Invalid input for lab marks. Terminating program.");
			return;
		}
		if (percentageOfExam + percentageOfLab != 100) {
			System.out.println("The percentages must add up to 100. Terminating program.");
			return;
		}
		
		double finalMark = (examMarks * percentageOfExam / 100) + (labMarks * percentageOfLab / 100);
		
		System.out.println("Final Exam Mark is: " + finalMark);
		
	}
}