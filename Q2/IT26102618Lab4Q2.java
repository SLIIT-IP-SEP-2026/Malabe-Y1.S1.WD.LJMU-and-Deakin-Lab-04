import java.util.Scanner;

public class IT26102618Lab4Q2{
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter exam marks (out of 100): ");
		float examMarks = input.nextFloat();
		
		if(examMarks>100 || examMarks<0){
			System.out.println("Invalid input for exam marks. Terminating program.");
		}
		
		System.out.print("Please enter lab submission marks (out of 100): ");
		float labMarks = input.nextFloat();
		
		if(labMarks>100 || labMarks<0){
			System.out.println("Invalid input for lab marks. Terminating program.");
		 
		}
		
		System.out.print("Please enter the percentage given for the exam: ");
		float examPercentage = input.nextFloat();
		
		System.out.print("Please enter the percentage given for the lab submission: ");
		float labPercentage = input.nextFloat();
		
		if(examPercentage + labPercentage != 100){
			System.out.println("The percentages must add up to 100. Terminating program.");
		}
		
		float finalMarks = (examMarks * (examPercentage/100)) + (labMarks * (labPercentage/100));
		
		System.out.println();
		System.out.println("Final Exam Mark is: " + finalMarks);
		
		
	}

}