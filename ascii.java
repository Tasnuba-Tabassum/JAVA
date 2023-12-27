import java.util.Scanner;
public class ascii {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char character;
        System.out.print("Enter a character: ");
        character = input.next().charAt(0);
        int code = (int)character;
        System.out.println("The ASCII value of " + character + " is: " + code);
    }
}
