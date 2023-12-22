import java.util.Scanner;
public class switchCase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text;
        System.out.print("Please enter a command: ");
        text = input.nextLine();
        switch(text){
            case "start":
            System.out.println("Machine started!");
            break;

            case "stop":
            System.out.println("Machine stopped.");
            break;

            default:
            System.out.println("Command not recognized");
        }
    }
}
