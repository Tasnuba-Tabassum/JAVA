import java.util.Scanner;
public class methodMaxMinArray {
    static int Minimum(int arr[], int arraysize)
    {
        int minnum = 1234567890;
        for(int i=0;i<arraysize;i++){
            if(arr[i] < minnum)
            minnum = arr[i];
           }
           return minnum;
    }
    static int Maximum(int arr[], int arraysize)
    {
        int maxnum = 0;
        for(int i=0;i<arraysize;i++){
            if(arr[i] > maxnum)
            maxnum = arr[i];
           } 
           return maxnum;
    }
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
           System.out.println("Maximum number: " + Maximum( numbers, arraysize));
           System.out.println("Minimum number: " + Minimum(numbers, arraysize) );
    }
    }
