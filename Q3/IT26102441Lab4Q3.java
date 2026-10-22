import java.util.Scanner;
public class IT26102441Lab4Q3{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = obj.nextInt();
		String result;
		result = (number>0) ? "positive" : (number<0) ? "negative" : "number is zero" ;
		System.out.println(result);
	}
}
		