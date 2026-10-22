import java.util.Scanner;

public class IT26102157Lab4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = sc.nextDouble();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            sc.close();
            return;
        }

        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = sc.nextDouble();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab marks. Terminating program.");
            sc.close();
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        double examPer = sc.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPer = sc.nextDouble();

        if ((examPer + labPer) != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            sc.close();
            return;
        }

        double finalMark = (examMarks * examPer / 100) + (labMarks * labPer / 100);
        
        System.out.println("\nFinal Exam Mark is : " + finalMark);

        sc.close();
    }
}