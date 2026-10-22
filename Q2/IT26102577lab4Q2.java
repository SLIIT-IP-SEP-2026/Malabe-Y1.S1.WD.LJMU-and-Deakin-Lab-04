import java.util.Scanner;

public class IT26102577lab4Q2{
	
	public static void main(String[] args) 
	{
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Exam Marks(out of 100): ");
		double exam = input.nextDouble();
		
		if ((exam > 100) || (exam < 0 ))
		{
			System.out.print("Enter a valid exam mark (out of 100) ( between 100 and 0). Terminating Program");
			return;
		}
			
		
		System.out.println("Please enter the percentage given for the exam: ");
		double exam_p = input.nextDouble();
		
		if ((exam_p > 100 ) ||  (exam < 0))
		{
			System.out.print("Enter a valid percentage (out of 100) ( between 100 and 0). Terminating Program");
			return;
		}
			
		System.out.println("Enter Lab Submission marks(out of 100): ");
		double lab = input.nextDouble();
		
		if ((lab > 100) || (lab < 0 ))
		{
			System.out.print("Enter a valid Lab sumbission mark (out of 100) ( between 100 and 0). Terminating Program");
			return;
		}
			
		System.out.println("Please enter the percentage given for the lab submission: ");
		double lab_p = input.nextDouble();
		
				
		if ((lab_p > 100) || (lab_p < 0 ))
		{
			System.out.print("Enter a valid lab sumbmission percentage (out of 100) ( between 100 and 0). Terminating Program");
			return;
		}
					
		double total_p = exam_p + lab_p ;
					
		if (total_p != 100)
		{
			System.out.println("The total percentage should be 100. terminating program. ");
			return;
		}
		
		double final_mark = ((exam*exam_p)/ 100) + ((lab*lab_p)/100);
		System.out.println("Final Marks: "+ final_mark);
	}
}
		