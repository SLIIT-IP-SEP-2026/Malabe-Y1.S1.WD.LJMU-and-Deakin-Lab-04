import java.util.Scanner;

public class IT26102381Lab4Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // postive or negative
        String result =
        number == 0 ? "The number is zero" :
        number > 0 ? "The number is positive" :
        "The number is negative";

        System.out.println(result);

        sc.close();
    }
}