/*Write a program that calculates the sum of the squares of all the odd numbers between 1 and a
given number. For example, if the user inputs the number 10, the program should print out 165
(which is the sum of 1+9+25+49+81).*/
import java.util.Scanner;
public class sumOfOddNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        for(int i=1;i<=number;i+=2){
            if (i % 2 != 0){
                sum += (i*i);
            }
        }
        System.out.print("Sum of the square of odd numbers from 1 to " + number + " is: " + sum);
    }
}
