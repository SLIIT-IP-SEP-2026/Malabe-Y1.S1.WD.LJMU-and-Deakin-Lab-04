import java.util.Scanner;
public class IT26102619Lab4Q2{
	public static void main(String[]args){
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter exam marks (out of hundred): ");
		int marks= input.nextInt();
		
		System.out.print("Enter exam lab submission marks (out of hundred): ");
		int labmarks= input.nextInt();
		
		System.out.print("Enter percentage for the given marks: ");
		double markspercentage= input.nextDouble();
		
		System.out.print("Enter percentage for the given Lab submissions: ");
		double labspercentage= input.nextDouble();
		
		if ( marks < 0 || marks > 100 ){
			System.out.println("Invalid input for exam marks. Terminating program.");
		return;
		}
		if ( labmarks < 0 || labmarks > 100 ){
			System.out.println("Invalid input for lab submisson marks. Terminating program.");
		return;
		}
		if (markspercentage + labspercentage != 100){
		System.out.println("The percentage must add up to 100. Terminating program.");
		return;
	}
	
		double finalmark =(marks*markspercentage/100 + labmarks*labspercentage/100);
		System.out.println("Final mark: "+ finalmark); 
		
		}
	}