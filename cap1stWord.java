import java.util.Scanner;
public class cap1stWord {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String mainLine;
    System.out.print("Enter a String: ");
    mainLine = input.nextLine();
    char[] mainarray = mainLine.toCharArray();
    boolean fndSpace = true;
    for(int i=0;i<mainarray.length;i++)
    {
        if(Character.isLetter(mainarray[i]))
        {
            if(fndSpace){
            mainarray[i] = Character.toUpperCase(mainarray[i]);
            fndSpace = false;
        }
        }else{
            fndSpace = true;
        }
    }
    mainLine = String.valueOf(mainarray);
    System.out.println(mainLine);
  }  
}
