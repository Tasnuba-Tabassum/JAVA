import java.util.Scanner;
public class tfofintsum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter first integer: ");
        num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        num2 = input.nextInt();
        System.out.print("Enter third integer: ");
        num3 = input.nextInt();
        if(num3 == num1 + num2)
        {
            System.out.println("True");
        }else if( num3 != num1 + num2)
        {
            System.out.println("False");
        }
    }
}
