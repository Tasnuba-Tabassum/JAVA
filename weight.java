import java.util.Scanner;
public class weight {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double weight, height;
    System.out.print("Input weight in pounds: ");
    weight = input.nextDouble();
    System.out.print("Input height in inches: ");
    height = input.nextDouble();
    double inches = height*height;
    double mass = (weight/inches)*703;
    System.out.println("Body mass index is: " + mass);
   } 
}
