import java.util.Scanner;

public class IT26102616Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        int examMarks = input.nextInt();
        if (examMarks < 0 || examMarks > 100) {
            
			System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        System.out.print("Please enter lab submission marks (out of 100): ");
        int labMarks = input.nextInt();
        if (labMarks < 0 || labMarks > 100) {
           
		   System.out.println("Invalid input for lab marks. Terminating program.");
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        int examPercent = input.nextInt();

        System.out.print("Please enter the percentage given for the lab submission: ");
        int labPercent = input.nextInt();

        if (examPercent + labPercent != 100) {
            
			System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        double finalMark = (examMarks * examPercent / 100.0) + (labMarks * labPercent / 100.0);
        
		System.out.println("Final Exam Mark is : " + finalMark);

        input.close();
    }
}
