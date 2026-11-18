import java.util.Scanner;

public class IT26102753Lab4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(
            (num > 0) ? "Positive" :
            (num < 0) ? "Negative" : "Zero"
        );
    }
}