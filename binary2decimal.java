import java.util.Scanner;
public class binary2decimal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int binaryNum;
        System.out.println("Enter binary number: ");
        binaryNum = input.nextInt();
        int decimalNum = 0;
        int power = 0;
     for (int i = binaryNum - 1; i >= 0; i--) {
        decimalNum += binaryNum * Math.pow(2, power);
        power--;
    }
    System.out.println("Decimal number: " + decimalNum);
}
}