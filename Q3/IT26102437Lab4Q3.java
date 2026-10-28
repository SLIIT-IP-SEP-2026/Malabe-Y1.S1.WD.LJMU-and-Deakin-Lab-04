import java.util.Scanner;
public class IT26102437Lab4Q3{
	public static void main(String[]args){
		double number;
		String result;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = input.nextDouble();
		result = (number > 0) ? "The number is positive" : (number < 0) ? "The number is negative" : "The number is zero";	
		System.out.println(result); 
		
	}
}