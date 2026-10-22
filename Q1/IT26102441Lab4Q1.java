import java.util.Scanner;
public class IT26102441Lab4Q1{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = obj.nextInt();
		if(number>0){
			System.out.println("positive");
		}
		else if(number<0){
			System.out.println("negative");
		}
		else{
			System.out.println("number is zero");
		}
	}
}