import java.util.Scanner;

public class IT26102381Lab4Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // postive or negative
        if (number == 0) System.out.println("The number is zero");
        else if (number > 0) System.out.println("The number is positive");
        else System.out.println("The number is negative");

        sc.close();
    }
}