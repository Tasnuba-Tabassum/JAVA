import java.util.Scanner;
public class sumofDigit {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int number;
    System.out.print("Enter an integer: ");
    number = input.nextInt();
    int sum = 0;
    if(number > 0) {
        //last number alada korlam
        int lastDigit = number % 10;
        //sum e last number add korlam
        sum += lastDigit;
        // number theke last digit baad dilam
        number /= 10;
        //aager sum er shathe first number add korlam
        sum += number;
    }
    System.out.println("The sum of the digits is: " + sum);
    }
}