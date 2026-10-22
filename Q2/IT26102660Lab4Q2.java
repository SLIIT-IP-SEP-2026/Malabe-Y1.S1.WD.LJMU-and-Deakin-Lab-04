import java.util.Scanner;

public class IT26102660Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        int ExmMarks = input.nextInt();
        if (ExmMarks < 0 || ExmMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        System.out.print("Please enter lab submission marks (out of 100): ");
        int LabMarks = input.nextInt();
        if (LabMarks < 0 || LabMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        double ExmPercentage = input.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double LabPercentage = input.nextDouble();

        if (ExmPercentage + LabPercentage != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        double FinalExamMark = (ExmMarks * ExmPercentage / 100) + (LabMarks * LabPercentage / 100);
        System.out.println("\nFinal Exam Mark is : " + FinalExamMark);
        input.close();
    }
}
