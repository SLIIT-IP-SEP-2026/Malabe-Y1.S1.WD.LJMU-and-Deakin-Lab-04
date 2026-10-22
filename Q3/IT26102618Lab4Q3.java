import java.util.Scanner;

public class IT26102618Lab4Q3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		String result = (number>0)?"The number is: Positive" :(number<0)?"The number is: Negative" :"The number is zero";

		System.out.print(result);
		
	}

}