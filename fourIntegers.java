import java.util.Scanner;
public class fourIntegers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1,num2,num3,num4;
        System.out.print("Enter first integer: ");
        num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        num2 = input.nextInt();
        System.out.print("Enter third integer: ");
        num3 = input.nextInt();
        System.out.print("Enter fourth integer: ");
        num4 = input.nextInt();
        if(num1==num2&&num2==num3&&num3==num4&&num4==num1)
        {
            System.out.println("Numbers are equal");
        } else{
            System.out.println("Numbers are not equal");
        }
    }
}
