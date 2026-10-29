import java.util.Scanner;

public class IT26102621Lab4Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        String result = (num > 0) ? "Number is Positive"
                        : (num < 0) ? "Number is Negative"
                        : "Number is Zero";

        System.out.println(result);

        input.close();
    }
}