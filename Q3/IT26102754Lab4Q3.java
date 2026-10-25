import java.util.Scanner;
public class IT26102754Lab4Q3
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int number = sc.nextInt();

        String result = (number>0) ? "Number is Positive": (number<0) ? "Number is Negative": "Number is 0";

        System.out.print(result);
    }
}