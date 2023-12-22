/*Write a program that prompts the user to input a positive integer. It should then print the
multiplication table of that number.*/
import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args){
        Scanner table = new Scanner(System.in);
        int number;
        System.out.print("Enter a positive integer: ");
        number = table.nextInt();
        System.out.println("Multiplication table for " + number + ": ");
        for(int i=0;i<10;i++)
        {
            System.out.println(number + "x" + i + "= " + (number * i));
        }
    }
    
}
