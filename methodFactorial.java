import java.util.Scanner;
public class methodFactorial {
    static void factorial(int number){
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }System.out.println("The factorial of " + number + " is: " + factorial);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        factorial(number);
    }
}
