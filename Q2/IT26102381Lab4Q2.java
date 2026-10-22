import java.util.Scanner;

public class IT26102381Lab4Q2 {

    public static void main(String[] args) {

    // • Input the exam marks (given out of 100) and the lab submission marks (given out of 100) from the keyboard
    // • Validate the entered marks (should be greater than or equal to 0 and less than or equal to 100)
    // • Input the percentage taken from the exam mark and the lab submission mark from the keyboard
    // • Validate the values (entered percentages should add to 100)
    // • Calculate the final exam marks

        Scanner sc = new Scanner(System.in);

        double examMarks, labMarks, examPercent, labPercent;

        // [Input and Validation]
        System.out.print("Please enter exam marks (out of 100): ");
        examMarks   = sc.nextDouble();

        if (examMarks > 100 || examMarks < 0) {
            System.out.println("Invalid input for exam marks. Terminating the Program...");
            return;
        }

        System.out.print("Please lab submission marks (out of 100): ");
        labMarks    = sc.nextDouble();
        if (labMarks > 100 || labMarks < 0) {
            System.out.println("Invalid input for lab submission marks. Terminating the Program...");
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        examPercent = sc.nextDouble();
        System.out.print("Please enter the percentage given for the lab submission: ");
        labPercent  = sc.nextDouble();

        if (examPercent + labPercent != 100) {
            System.out.println("The percentages must add up to 100. Terminating the Program...");
            return;
        }

        // [Calculation]
        double result = examMarks * (examPercent / 100) + labMarks * (labPercent / 100);

        System.out.print("Final exam mark is: " + result);

        sc.close();
    }
}