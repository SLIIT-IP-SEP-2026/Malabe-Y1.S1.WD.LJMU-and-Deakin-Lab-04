import java.util.Scanner;

public class IT26102761Lab4Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter exam mark: ");
        double examMark = input.nextDouble();

        System.out.print("Enter lab submission mark: ");
        double labMark = input.nextDouble();

        if (examMark < 0 || examMark > 100 || labMark < 0 || labMark > 100) {
            System.out.println("Invalid marks!");
        } else {

            System.out.print("Enter exam percentage: ");
            double examPercentage = input.nextDouble();

            System.out.print("Enter lab percentage: ");
            double labPercentage = input.nextDouble();

            if ((examPercentage + labPercentage) != 100) {
                System.out.println("Invalid percentages!");
            } else {

                double finalMark =
                        (examMark * examPercentage / 100) +
                        (labMark * labPercentage / 100);

                System.out.println("Final Mark = " + finalMark);
            }
        }

        input.close();
    }
}