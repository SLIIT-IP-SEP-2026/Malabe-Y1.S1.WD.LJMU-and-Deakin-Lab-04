import java.util.Scanner;
	public class IT26102617Lab4Q2{
		public static void main(String[] args){
		
		Scanner value = new Scanner(System.in);
		
		
		System.out.print("Please enter exam marks(out of 100):");
		double examMarks = value.nextDouble();
		
		if (examMarks <0 || examMarks>100)
		{
		System.out.println("Invalid input for exam marks. Terminating program.:");
		}
		
		
		System.out.print("Please enter lab submission marks (out of 100):");
		double labSubmissionMarks = value.nextDouble();
		
		if (labSubmissionMarks<0 || labSubmissionMarks>100)
		{
		System.out.println("Invalid input for exam marks. Terminating program.");
		}
		
		
		System.out.print("Please enter the percentage given for the exam:");
		double percentageExam = value.nextDouble();
		
		System.out.println("Please enter the percentage given for the lab submission:");
		double percentageLabSubmission = value.nextDouble();
		
		if  ((percentageExam + percentageLabSubmission)!=100)
		{
			System.out.println("Invalid input for exam marks. Terminating the program.");
		}
		
		
		double finalMark = (examMarks*percentageExam/100)+(labSubmissionMarks*percentageLabSubmission/100);
		System.out.print("FinaL Exam Mark is:" + finalMark);
		
		}
	}
		 