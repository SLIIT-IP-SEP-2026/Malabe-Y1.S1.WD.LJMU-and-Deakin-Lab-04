
import java.util.Scanner;

public class IT26102428Lab4Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String result = (number > 0)? "Positive number": (number < 0)? "Negative number": "Number is Zero";
		System.out.println(result);

        input.close();
    }
}
