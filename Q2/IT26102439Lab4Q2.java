import java.util.Scanner;
public class IT26102439Lab4Q2{
	public static void main(String [] args){
		Scanner object=new Scanner(System.in);
		
		double examMarks, labMarks;
		double examPercentage, labPercentage;
		double finalMarks;
		
		System.out.print("Please enter exam marks (Out of 100): ");
		examMarks=object.nextDouble();
		
		if(examMarks<0 || examMarks>100){
			System.out.println("invalid input for exam marks. Terminating programme");
			object.close();
			return;
		}
		
		System.out.print("Please enter lab submission marks (Out of 100): ");
		labMarks=object.nextDouble();
		
		if(labMarks<0 || labMarks>100){
			System.out.println("Invalid input for lab marks> Terminating programme");
			object.close();
			return;
		}
		
		System.out.print("Please enter the percentage given for the exam: ");
		examPercentage=object.nextDouble();
		
		System.out.print("Please enter the percentage given for the lab submission: ");
		labPercentage=object.nextDouble();
		
		if(examPercentage + labPercentage !=100) {
			System.out.println("The percentage must add upto 100. Terminating programme");
			object.close();
			return;
		}
		
		finalMarks=(examMarks*examPercentage/100)+(labMarks*labPercentage/100);
		
		System.out.println("Final exam marks is: " + finalMarks);
		
		object.close();
	}
}