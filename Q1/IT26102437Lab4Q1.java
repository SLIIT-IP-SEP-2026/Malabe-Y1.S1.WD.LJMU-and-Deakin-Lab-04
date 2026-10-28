import java.util.Scanner; 
public class IT26102437Lab4Q1{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double number = input.nextDouble();
		if (number > 0){
			System.out.println("The number is positive: " + number);
			
		} else if (number < 0 ) {
			System.out.println("The number is negative: " + number);
			
		} else {
			System.out.println("The number is zero: " + number);
		}
	}
}