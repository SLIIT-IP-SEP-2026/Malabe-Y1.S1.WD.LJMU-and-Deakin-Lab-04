import java.util.Scanner;
public class IT26102619Lab4Q3{
	public static void main(String[]args){
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int num= input.nextInt();
		
		String result = (num > 0) ? "The Number Is: Positive " :(num < 0) ? "The Number Is: Negative " : "The Number Is Zero ";
		
		System.out.println(result);
	}
}