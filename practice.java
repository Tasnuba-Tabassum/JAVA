import java.util.Scanner;
public class practice {
    public static void main(String[] args){
       Scanner std = new Scanner(System.in);
       String stdname;
       int number;
       int total_marks=0;
       System.out.print("Enter your name: ");
       stdname = std.nextLine();
       for(int i=0;i<5;i++)
       {
        System.out.print("Enter your marks for subject " + (i+1) +": ");
        number = std.nextInt();
        total_marks += number;
       }
       System.out.println("Total Marks: " + total_marks);
       System.out.print("Average of total marks: " + (total_marks / 5));
    }
}
