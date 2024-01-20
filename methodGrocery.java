import java.util.Scanner;
public class methodGrocery {
    static float average(double array1[], int products){
        int sum = 0;
        float average = 0;
        for (int i = 0; i < products; i++){
            sum += array1[i];
        } average = sum/products;
        System.out.println("The sum of the array is: " + sum);
        return average;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bazar");
        int products;
        System.out.print("How many products did you buy? ");
        products = input.nextInt();
        String[] prdName = new String[products];
        double[] price = new double[products];
        for(int i=0; i<products; i++)
        {
            System.out.print("Name of product " + (i+1) + ": ");
            input.nextLine();
            prdName[i] = input.nextLine();
            System.out.print("Price of product " + (i+1) + ": ");
            price[i] = input.nextDouble();
    }
    System.out.println("The average of the total price is : "+ average(price, products));
}
}