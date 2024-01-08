import java.util.Scanner;
public class triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        {
            int num1,num2,num3;
            System.out.print("Enter value for 1st side: ");
            num1 = input.nextInt();
            System.out.print("Enter value for 2nd side: ");
            num2 = input.nextInt();
            System.out.print("Enter value for 3rd side: ");
            num3 = input.nextInt();
            int some = (num1*num1) + (num2*num2);
            int sqr = num3*num3;
            if(num1 == num2 && num2 == num3 && num3 == num1){
                System.out.println("It is an Equilateral Triangle");
            }else if(num1==num2 || num3== num1 || num2 == num3){
                System.out.println("It is an Isosceles Triangle");
            }else if(some == sqr){
                System.out.println("It is a right angle triangle");}
                else if(num1 != num2 && num2 != num3 && num3 != num1){
                System.out.println("It is a Scalene Triangle");
            }
            }
        }
    }
