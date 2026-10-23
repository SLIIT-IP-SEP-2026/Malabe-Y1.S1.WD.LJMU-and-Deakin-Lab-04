import java.util.Scanner; 

public class IT26102427Lab4Q3 {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in); 

        System.out.print("Enter the Number: "); 
        int num = input.nextInt(); 

        String result = (num < 0)? "The numebris: Negative":(num > 0)?"The number is: Positive": "The number is zero"; 

        System.out.println(result); 
    }
}