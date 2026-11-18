import java.util.Scanner;

public class IT26102753Lab4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Exam Marks: ");
        double exam = sc.nextDouble();

        System.out.print("Lab Marks: ");
        double lab = sc.nextDouble();

        System.out.print("Exam Percentage: ");
        double examPer = sc.nextDouble();

        System.out.print("Lab Percentage: ");
        double labPer = sc.nextDouble();

        if (exam < 0 || exam > 100 || lab < 0 || lab > 100) {
            System.out.println("Invalid Marks");
        } else if (examPer + labPer != 100) {
            System.out.println("Invalid Percentages");
        } else {
            double finalMark = (exam * examPer / 100) + (lab * labPer / 100);
            System.out.println("Final Mark = " + finalMark);
        }
    }
}