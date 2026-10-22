
import java.util.Scanner;

public class IT26102577lab4Q1{
	
	public static void main(String[] args) 
	{
			
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		double num = input.nextDouble();
		
		if (num > 0 )
		{
			System.out.print("Number is: Positive");
		}
		
		else if (num < 0)
		{
			System.out.print("Number is: Negative");
		}
		
		else
		{
			System.out.print("Number is: Zero");
		}
	}
}