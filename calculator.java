import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter 1st number: ");
        num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = input.nextInt();
        double sum = 0;
        System.out.print("Choose an operation(+, -, *, /, %): ");
        char operation = input.next().charAt(0);
        if(operation == '+'){
            sum = num1 + num2;
        } else if(operation == '-'){
            sum = num1-num2;
        }else if(operation == '*'){
            sum = num1 * num2;
        }else if(operation == '/'){
            sum = num1/num2;
        }else if(operation == '%'){
            sum = num1 % num2;
        }System.out.println("Answer: "+ sum);
    }
}
