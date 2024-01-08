import java.util.Scanner;
public class vowelchecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String mainLine;
        System.out.print("Enter a String: ");
        mainLine = input.nextLine();
        char[] mainarray = mainLine.toCharArray();
        int count = 0;
        for(int i=0;i<mainarray.length;i++){
            if(mainarray[i] == 'a'|| mainarray[i] == 'e'|| mainarray[i] =='i'|| mainarray[i] == 'o'|| mainarray[i] =='u'|| mainarray[i] == 'A'|| mainarray[i] == 'E'|| mainarray[i] == 'I'|| mainarray[i] == 'O'||mainarray[i] == 'U'){
                count += 1;
            }
        } System.out.println("Number of vowels: " + count);
    }
}
