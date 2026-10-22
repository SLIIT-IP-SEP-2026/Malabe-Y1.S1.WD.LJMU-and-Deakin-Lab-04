import java.util.Scanner;
	public class IT26102617Lab4Q1{
		public static void main(String[] args){
		
		Scanner value = new Scanner(System.in);
		
			System.out.println("Enter a number: ");
			int number = value.nextInt();
			
			
			if (number == 0)
			{
			System.out.println("The number is : Zero");
			}
			
			else if (number>0)
			{
			System.out.println("The number is : Positive");
			}
			
			else
			{
			System.out.println("The number is : Negative");
			}
			
		}
	}
			
		