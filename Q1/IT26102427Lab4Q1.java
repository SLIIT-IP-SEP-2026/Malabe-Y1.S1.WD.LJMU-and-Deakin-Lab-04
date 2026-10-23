import java.util.Scanner; 

public class IT26102427Lab4Q1 {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in); 

        System.out.print("Enter the Number: "); 
        double num = input. nextDouble(); 

        if (num > 0) {
            System.out.println("Positive Number");

        } else if (num < 0) {
            System.out.println("Negative Number");

        }else {

            System.out.println("The number is Zero");
        }
    }
}