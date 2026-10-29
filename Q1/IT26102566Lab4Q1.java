import java.util.Scanner;
 
public class IT26102566Lab4Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter a number: ");
        double num = input.nextDouble();
 
        if (num > 0) {
            System.out.println("The number is: Positive");
        } else if (num < 0) {
            System.out.println("The number is: Negative");
        } else {
            System.out.println("The number is Zero");
        }
    }
}
 