import java.util.Scanner;
public class temperature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter the temperature in celsius: ");
        number = input.nextInt();
        double result = (number* 9/5) + 32;
        System.out.println("Temperature in fahrenheit: " + result);
    }
}
