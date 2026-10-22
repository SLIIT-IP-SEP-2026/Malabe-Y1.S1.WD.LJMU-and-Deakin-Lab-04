import java.util.Scanner;
public class IT26102662Lab4Q2{

	public static void main (String [] args) {
	
	Scanner input = new Scanner (System.in);
	
	System.out.print("Please Enter Exam Marks (out of 100):");
	int examMarks = input.nextInt();
	
	System.out.print("Please Enter Lab Submission Marks (out of 100):");
	int labSubmissionMarks = input.nextInt();
	
	System.out.print("Please Enter percentage given for the Exam Marks:");
	double percentageMarks = input.nextInt();
	
	System.out.print("Please Enter percentage given Lab Submission Marks:");
	double percentageOfLabSubmissionMarks = input.nextInt();
	
	if (examMarks < 0 || examMarks > 100){
		System.out.println("Invalid input for exam marks. Terminating program.");
		return;
	}
	if (labSubmissionMarks < 0 || labSubmissionMarks > 100){
		System.out.println("Invalid input for Lab Submission marks. Terminating program.");
		return;
	}
	if (percentageMarks + percentageOfLabSubmissionMarks != 100){
		System.out.println("The percentage must add up to 100. Terminating program.");
		return;
	}
	
		double finalExamMark = (examMarks * percentageMarks/100) + (labSubmissionMarks * percentageOfLabSubmissionMarks/100);
		
		System.out.println("Final Exam Marks:"+finalExamMark);
	
	
   }


}