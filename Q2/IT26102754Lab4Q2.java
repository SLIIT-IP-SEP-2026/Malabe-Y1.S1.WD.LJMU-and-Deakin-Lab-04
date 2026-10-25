import java.util.Scanner;
public class IT26102754Lab4Q2 
{
 public static void main(String[] args) 
 {
     Scanner sc = new Scanner(System.in);

     System.out.print("Please enter the exam marks (out of 100) :");
     int exam_marks = sc.nextInt();

      if (exam_marks>100 || exam_marks<0)
     {
        System.out.println("Invalid mark");
        return;
     }

     System.out.print("Please enter lab submission marks (out of 100) :");
     int lab_marks = sc.nextInt();
     
     if (lab_marks>100 || lab_marks<0)
     {
        System.out.print("Invalid mark");
        return;
     }   
     
     System.out.print("Enter exam percentage marks :");
     double exam_percentage = sc.nextDouble();
     System.out.print("Enter lab submission percentage marks :");
     double lab_percentage = sc.nextDouble();
    
     double percentage_total = exam_percentage+lab_percentage;

     if (percentage_total != 100)
     {
        System.out.print("The percentage marks inputted aren't valid");
        return;
     }
         
     int final_marks = (exam_marks+lab_marks)/2;
     System.out.print("Final Exam Mark is = " + final_marks);
 }   
}
