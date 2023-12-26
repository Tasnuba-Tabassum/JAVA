import java.util.Scanner;
public class seconds2hms {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int seconds;
    System.out.print("Enter Seconds: ");
    seconds = input.nextInt();
    int hours = seconds / 3600;
    int remaining = seconds % 3600;
    int minutes = remaining / 60;
    int finalseconds = remaining % 60;
    System.out.println( hours + ":" + minutes + ":" + finalseconds );
   } 
}
