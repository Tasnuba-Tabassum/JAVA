import java.util.Scanner;
public class reverseString {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String userinput;
    String reverse = " ";
    System.out.print("Input a String: ");
    userinput = input.nextLine();
    char character;
    for (int i = 0; i< userinput.length(); i++)
    {
        character = userinput.charAt(i);
        reverse = character + reverse;
    }
    System.out.println("Reversed String: " + reverse);
    }
}
