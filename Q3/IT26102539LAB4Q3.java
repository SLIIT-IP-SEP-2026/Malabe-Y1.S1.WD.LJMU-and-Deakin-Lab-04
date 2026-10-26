import java.util.Scanner;

public class IT26102539LAB4Q3 {
    public static void main(String [] args ) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter The Number: ");
		double num = input.nextDouble();
		
		System.out.println((num < 0) ?  "The Number Is : Negative" : "The Number Is: Positive");
	}
}
	