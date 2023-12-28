import java.util.Scanner;
public class avgofarray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int valuearray;
        System.out.print("Input the value of array: ");
        valuearray = input.nextInt();
        double[] array = new double[valuearray];
        double average = 0;
        int sum = 0;
        for(int i = 0;i<valuearray;i++)
        {
            array[i] = input.nextInt();
            sum += array[i];
        }
         average = sum / valuearray;
        System.out.println("The average of the array is: " + average);
        System.out.println("The numbers in the said array that are greater than the average are: ");
        for(int i = 0;i<valuearray; i++)
        {if(array[i]>average){
             System.out.println(array[i]);
        }
}
}
}