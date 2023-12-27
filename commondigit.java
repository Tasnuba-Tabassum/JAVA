import java.util.Scanner;
public class commondigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter first ineteger(between 25 to 75): ");
        num1 = input.nextInt();
        System.out.print("Enter second integer(between 25 to 75): ");
        num2 = input.nextInt();
        int sum1 = 0;
        int sum2 = 0;
            //last number alada korlam
            int lastDigit1 = num1 % 10;
            // number theke last digit baad dilam
            num1 /= 10;
            //last number alada korlam
            int lastDigit2 = num2 % 10;
            // number theke last digit baad dilam
        if( lastDigit1 == lastDigit2){
            System.out.println("Result True");
        }else if (num1 == num2){
            System.out.println("Result True");
        }else{
            System.out.println("Result False");
        }
    }
}
