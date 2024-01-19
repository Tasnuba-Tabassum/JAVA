import java.util.Scanner;
public class methodCalculator {
     static void operations(char character, double num1, double num2){
        double result = 0;
        if (character == '+'){
            result = (num1 + num2);
        }else if (character == '-'){
            result = (num1 - num2);
        }else if(character == '/'){
             result = (num1 / num2);
        }else if(character == '*'){
             result = (num1 * num2);
        } 
        System.out.println("Result: " + result);
     }
    public static void main(String[] args){
        double num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num1 = input.nextDouble();
        System.out.print("Enter another number: ");
        num2 = input.nextDouble();
        System.out.print("Enter operation: ");
        char operation = input.next().charAt(0);
        operations(operation, num1, num2);
    }
    
}
