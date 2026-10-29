import java.util.Scanner;

public class IT26102581Lab4Q2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		double examMarks;
		double labMarks;
		double examPercentage;
		double labPercentage;
		double finalMarks;
		
		System.out.print("Please enter exam marks(out of 100): ");
		examMarks = input.nextDouble();
		
		System.out.print("Please enter lab submission marks (out of 100): ");
		labMarks = input.nextDouble();
		
		if (examMarks >= 0 && examMarks <= 100 && labMarks >= 0 && labMarks <= 100){
			
			System.out.print("Please enter the percentage given for the exam: ");
			examPercentage = input.nextDouble();
			
			System.out.print("Please enter the percentage given for the lab submission: ");
			labPercentage = input.nextDouble();
			
			if (examPercentage + labPercentage == 100.0) {
				
				finalMarks = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
				System.out.println();
				System.out.println("Final Marks: " + finalMarks);
			}
			else {
				System.out.println();
				System.out.println("The percentages must add up to 100. Terminating program.");
			}
		}
		else {
			System.out.println();
			System.out.println("Invalid input for exam marks. Terminating program.");
		}
	}
}