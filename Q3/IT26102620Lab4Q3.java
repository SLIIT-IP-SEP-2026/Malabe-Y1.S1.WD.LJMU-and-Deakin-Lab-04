import java.util.Scanner;

public class IT26102620Lab4Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		double num = input.nextDouble();
		
		String result = (num > 0) ? "The Number is: Positive" :(num < 0) ? "The Number is: Negative" :"The Number is Zero";
		
		System.out.println(result);
	}
}

	
		
		