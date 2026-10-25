import java.util.Scanner;

public class IT26102578Lab4Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double numEnter = input.nextDouble();

        if (numEnter > 0) {
            System.out.println("Number " + numEnter + " is Positive");
        } else if (numEnter < 0) {
            System.out.println("Number " + numEnter + " is Negative");
        } else {
            System.out.println("Number " + numEnter + " is Zero");
        }

        input.close();
    }
}

			
		
		
		