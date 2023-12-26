import java.util.Scanner;
public class cmpr2num {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num1;
    int num2;
    System.out.print("Enter first Integer: ");
    num1 = input.nextInt();
    System.out.print("Enter second Integer: ");
    num2 = input.nextInt();
    if(num1 != num2)
    {
        System.out.println(num1 + " != " + num2);
    }else{
        System.out.println(num1 + " = " + num2);
    }
    if(num1 > num2)
    {
        System.out.println( num1 + " > " + num2);
        System.out.println( num1 + " >= " + num2);
    }else if(num1 < num2){
        System.out.println( num1 + " < " + num2);
        System.out.println( num1 + " <= " + num2);
    }
    }
    }
