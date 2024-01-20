import java.util.Scanner;
public class methodAvgofArray {
    static float averagearray(int array1[], int n){
        int sum = 0;
        float average = 0;
        for (int i = 0; i < n; i++){
            sum += array1[i];
        } average = sum/n;
        System.out.println("The sum of the array is: " + sum);
        return average;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the total number of elements in the array: ");
        n = input.nextInt();
        
        int array2[] = new int[n];
        System.out.print("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            array2[i]=input.nextInt();
        }
        System.out.println("The average of the array is : "+ averagearray(array2, n));
    }
}
