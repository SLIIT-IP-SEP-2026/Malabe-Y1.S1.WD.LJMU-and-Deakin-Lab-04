
import java.util.Scanner;

public class IT26102751Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input exam marks
        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = input.nextDouble();

        // Validate exam marks
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            input.close();
            return;
        }

        // Input lab submission marks
        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = input.nextDouble();

        // Validate lab marks
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab marks. Terminating program.");
            input.close();
            return;
        }

        // Input percentages
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = input.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercentage = input.nextDouble();

        // Validate percentages
        if (examPercentage < 0 || labPercentage < 0 ||
            examPercentage > 100 || labPercentage > 100 ||
            examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            input.close();
            return;
        }

        // Calculate final mark
        double finalMark = (examMarks * examPercentage / 100)
                         + (labMarks * labPercentage / 100);

        System.out.println("Final Exam Mark is : " + finalMark);

        input.close();
    }
}
