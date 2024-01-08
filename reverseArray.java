import java.util.Scanner;
public class reverseArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arraysize;
        System.out.print("Enter the size of the array : ");
        arraysize = input.nextInt();
        int[] numbers = new int[arraysize];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arraysize; i++) {
           numbers[i] = input.nextInt();
       }
       for(int i=arraysize-1;i <= arraysize;i--)
       {
        System.out.print(numbers[i] + " ");
       }
    }
}
