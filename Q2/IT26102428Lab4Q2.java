
import java.util.Scanner;

public class IT26102428Lab4Q2 {
	public static void main(String[]args){
		
        Scanner input = new Scanner(System.in);
		
        System.out.print("Please enter exam marks (Out of 100): ");
		double examMarks = input.nextDouble();
		
        System.out.print("Please enter Lab Submission marks (Out of 100): ");
		double labMarks = input.nextDouble();
		
		System.out.print("Please enter the percentage given for the exam: ");
       	double percentageExam = input.nextDouble();
			
		System.out.print("Please enter the percentage given for the Lab Submission: ");
		double percentageLab = input.nextDouble();
		
		if (examMarks < 0 || examMarks > 100 || labMarks < 0 || labMarks > 100) {
			System.out.print("Invalid Mark!");
			
		}else if (percentageExam + percentageLab != 100){
				System.out.print("Invalid percentage Marks!");
			
			}else{
			    double finalMark = (examMarks * percentageExam / 100) + (labMarks * percentageLab / 100);
				System.out.print("Final Mark is: " + finalMark);
			}
    }   
}		