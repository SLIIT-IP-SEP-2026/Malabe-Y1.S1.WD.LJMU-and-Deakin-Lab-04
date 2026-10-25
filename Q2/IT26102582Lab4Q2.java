import java.util.Scanner;

public class IT26102582Lab4Q2 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Please enter exam marks (out of 100): ");
	double examMarks = input.nextDouble();
	
	if ( examMarks < 0 || examMarks > 100 ) {
		System.out.println("Invalid input for exam marks. Terminating program.");
		return;
	}
	
	System.out.print("Please enter lab submission marks (out of 100): ");
	double labMarks = input.nextDouble();
	
	if ( labMarks < 0 || labMarks > 100 ) {
		System.out.println("Invalid input for lab submission marks. Terminating program.");
		return;
	}
	
	System.out.print("Please enter the percentage given for the exam: ");
	double examPercentage = input.nextDouble();
	
	if ( examPercentage < 0 || examPercentage > 100 ) {
		System.out.println("Invalid input for exam percentage. Terminating program.");
		return;
	}
	
	System.out.print("Please enter the percentage given for the lab submission: ");
	double labPercentage = input.nextDouble();
	
	if ( labPercentage < 0 || labPercentage > 100 ) {
		System.out.println("Invalid input for lab submission percentage. Terminating program.");
		return;
	}
	
	if ( examPercentage + labPercentage != 100 ) {
		System.out.println("The percentages must add up to 100. Terminating program.");
		return;
	}
	
	double finalExamMarks = ( examMarks * examPercentage/100 ) + ( labMarks * labPercentage/100 );
	
	System.out.println();
	System.out.print("Final Exam Mark is : " + finalExamMarks);
	System.out.println();
	
	}
}