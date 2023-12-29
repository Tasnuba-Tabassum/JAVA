import java.util.Scanner;
public class maxMinarray {
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
           int maxnum = 0;
           int minnum = 1234567890;
           for(int i=0;i<arraysize;i++){
            if(numbers[i] > maxnum)
            maxnum = numbers[i];
           }
           for(int i=0;i<arraysize;i++){
            if(numbers[i] < minnum)
            minnum = numbers[i];
           }
           System.out.println("Maximum number: " + maxnum);
           System.out.println("Minimum number: " + minnum );
    }
}
