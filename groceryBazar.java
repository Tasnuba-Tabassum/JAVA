import java.util.Scanner;
public class groceryBazar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Dream Bazar");
        System.out.println("---------------------------------------");
        String name;
        System.out.print("Please Enter your name: ");
        name = input.nextLine();
        System.out.println("Hello " + name + ".Hope you are doing well. Welcome to our shop.");
        int products;
        System.out.print("How many products did you buy? ");
        products = input.nextInt();
        System.out.println("Thanks for buying " + products + " products. Please input the product name and price of each product below.");
        String[] prdName = new String[products];
        double[] price = new double[products];
        double total_price = 0;
        double vat = 0;
        for(int i=0; i<products; i++)
        {
            System.out.print("Name of product " + (i+1) + ": ");
            input.nextLine();
            prdName[i] = input.nextLine();
            System.out.print("Price of product " + (i+1) + ": ");
            price[i] = input.nextDouble();
            total_price += price[i];
            vat = (total_price * 0.075);
        }
        System.out.println("-----------------------------------");
        System.out.println("             Invoice ");
        System.out.println("Customer name: " + name);
        for(int i=0;i<products;i++){
        System.out.println((i+1) + ". " + prdName[i] + "       " + price[i] + "Tk");
        }
        System.out.println("------------------------------------");
        System.out.println("Total price:               " + total_price + "Tk");
        System.out.println("VAT (7.5%)                 " + vat + "Tk");
        System.out.println("Total Payable Amount: " + (total_price + vat) + "Tk");
        System.out.println("Thank you for shopping with us");
        }
}
