import java.util.Scanner;
public class IT26102619Lab4Q1{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a Number: ");
		int number= input.nextInt();
		
		if ( number > 0 ){
			System.out.println("The number is positive: " + number);
		}
		
		else if ( number < 0 ){
			System.out.println("The number is Negative: " + number);
		
		}
		
		else{
			System.out.println("The number is Zero");
		}
	}
}