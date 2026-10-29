import java.util.Scanner;

public class IT26102581Lab4Q1 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		double number;
		
		System.out.print("Enter A Number:  ");
		number = sc.nextDouble();
		
		if (number > 0){
			System.out.println("The number is:Positive");
		}else if (number < 0){
			System.out.println("The number is:Negative");
		}else if (number == 0){
			System.out.println("The number is:Zero");
		}else {
			System.out.println("Invalid Input!");
		}
	}
}	
			