import java.util.Scanner;
public class arraysearch {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int arraysize;
    System.out.print("Enter the size of the array : ");
    arraysize = input.nextInt();
    int[] numbers = new int[arraysize];
    System.out.println("Enter the elements of the array: ");
       for (int i = 0; i < arraysize; i++) {
           numbers[i] = input.nextInt();
       }
       int searchNumber;
       System.out.print("Enter the number to search: ");
       searchNumber = input.nextInt();
       int found = 0;
       for (int i = 0; i < arraysize; i++) {
           if (numbers[i] == searchNumber) {
               found = i;
               break; // khuje felar por loop theke ber hoilam
           }
       }
       System.out.println("The number " + searchNumber + " is found at index " + found);
  }  
}
