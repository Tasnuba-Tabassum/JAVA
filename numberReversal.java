import java.util.Scanner;
public class numberReversal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter number: ");
        number = input.nextInt();
        int reversenum = 0;
        while(number>0) {
            //last number alada korlam
            int lastDigit = number % 10;
            reversenum = (reversenum * 10) + lastDigit;  // reverse number banailam
            number /= 10; //oi number baad disi
            //System.out.println("Reversed number: " + reversenum);
            }
            System.out.println("Reversed number: " + reversenum);
    }
}
