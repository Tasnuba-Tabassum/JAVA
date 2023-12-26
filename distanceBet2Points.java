import java.util.Scanner;
public class distanceBet2Points {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x1 , x2, y1, y2;
        System.out.println("Enter the First points:");
        System.out.print("X1: ");
        x1 = input.nextDouble();
        System.out.print("Y1: ");
        y1 = input.nextDouble();
        System.out.println("Enter the Second points:");
        System.out.print("X2: ");
        x2 = input.nextDouble();
        System.out.print("Y2: ");
        y2 = input.nextDouble();
        double distance = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));
        System.out.println("The distance between those points is: " + distance + " km");
}
}