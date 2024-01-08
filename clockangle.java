import java.util.Scanner;
public class clockangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Hour: ");
        int hour = input.nextInt();
        System.out.print("Enter minute: ");
        int minute = input.nextInt();
        int hourAngle = (hour * 30) + (minute / 2); 
        int minuteAngle = minute * 6;
        int angleDifference = (hourAngle - minuteAngle);
        int angle = (360 - angleDifference);
        System.out.println("The angle between the hour and minute hands is: " + angle + " degrees");
    }
}
