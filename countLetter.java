import java.util.Scanner;
public class countLetter {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String mainLine;
    int counting = 0;
    System.out.print("Enter a String: ");
    mainLine = input.nextLine();
    for (int i=0;i<mainLine.length(); i++){
        if(mainLine.charAt(i) != ' '){
            counting++ ;
        }
    }System.out.println("Total number of letters in the string: "+ counting);
    }
}
