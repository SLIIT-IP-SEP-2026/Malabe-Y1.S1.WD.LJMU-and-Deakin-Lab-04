import java.util.Scanner;
	public class IT26102617Lab4Q3{
		public static void main(String[] args){
		
		Scanner value = new Scanner(System.in);
		System.out.print("Enter a number:");
		int number = value.nextInt();
		
		String result = (number>0)?"The number is: Positive" :(number<0)?"The number is: Negative" :"the number is zero";
		System.out.print(result);
		
	}
}