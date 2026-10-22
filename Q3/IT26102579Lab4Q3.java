import java.util.Scanner;

public class IT26102579Lab4Q3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double number;
		String finalResult;
		
		System.out.print("Enter A Number: ");
		number = sc.nextDouble();
		
		finalResult = (number>0) ? "Positive":(number<0) ? "Negative":(number==0) ? "Zero": "Invalid";
		System.out.println("The number is: " + finalResult);
	}
}