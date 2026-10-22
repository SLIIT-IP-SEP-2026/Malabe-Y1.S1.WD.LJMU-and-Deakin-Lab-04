import java.util.Scanner;
public class IT26102441Lab4Q2{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the exam marks: ");
		int exam_marks= obj.nextInt();
		if (exam_marks >= 100 & exam_marks <= 0){
			System.out.println("invalid marks");
			return;
		}
		System.out.println("Enter the lab submission marks: ");
		int lab_marks= obj.nextInt();
		if (lab_marks >= 100 & lab_marks <= 0){
			System.out.println("invalid marks");
			return;
		}
		System.out.println("Enter the percentage given for the exam");
		int percentage1= obj.nextInt();
		System.out.println("Enter the percentage given for the exam");
		int percentage2= obj.nextInt();
		if (percentage1 >= 100 & percentage1 <= 0){
			System.out.println("invalid marks");
			return;
		}
		if (percentage2 >= 100 & percentage2 <= 0){
			System.out.println("invalid marks");
			return;
		}
		double final_exam_marks= exam_marks * percentage1/100;
		double final_lab_marks= lab_marks * percentage2/100;
		double total_marks = final_exam_marks+final_lab_marks;
		System.out.println(total_marks);
	}
}