import java.util.Scanner;

public class IT26102620Lab4Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		double num = input.nextDouble();
		
		if(num > 0){
			System.out.println("The Number is Positive");
		    }
        else if(num < 0){
			System.out.println("The Number is Negative");
		    }
		else {
			System.out.println("The Number is Zero");
		    }
	}
}

		