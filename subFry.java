import java.util.Scanner;
public class subFry {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("               Welcome to Sub Fry");
        System.out.println("------------------------------------------------------");
        System.out.println("Menu: ");
        System.out.println("Serial             Food Item             Price");
        System.out.println("1                    Pizza               555TK");
        System.out.println("2                    Burger              180TK");
        System.out.println("3                  French Fry             80TK");
        System.out.println("4                 Sub Sandwich           210TK");
        System.out.println("------------------------------------------------------");
        int number;
        System.out.print("What would you like to order? ");
        number = input.nextInt();
        System.out.println("Your order details: ");
        double total_price = 0;
        int totalPrepTime = 0;
        if(number==1){
            System.out.println("Pizza                  555TK");
             total_price = 555;
             totalPrepTime = 35;
        }else if(number==2){
            System.out.println("Burger                 180TK");
            total_price = 180;
             totalPrepTime = 20;
        }else if(number==3){
            System.out.println("French Fry              80TK");
            total_price = 80;
             totalPrepTime = 12;
        }else if(number==4){
            System.out.println("Sub Sandwich           210TK");
            total_price = 210;
             totalPrepTime = 24;
        }else if(number==12){
            System.out.println("Pizza                  555TK");
            System.out.println("Burger                 180TK");
            total_price = 555+180;
             totalPrepTime = 35;
        }else if(number==13){
            System.out.println("Pizza                  555TK");
            System.out.println("French Fry             80TK");
            total_price = 555+80;
             totalPrepTime = 35;
        }else if(number==14){
            System.out.println("Pizza                  555TK");
            System.out.println("Sub Sandwich           210TK");
            total_price = 555+210;
             totalPrepTime = 35;
        }else if(number==23){
            System.out.println("Burger                 180TK");
            System.out.println("French Fry             80TK");
            total_price = 180+80;
             totalPrepTime = 20;
        }else if(number==24){
            System.out.println("Burger                 180TK");
            System.out.println("Sub Sandwich           210TK");
            total_price = 180+210;
             totalPrepTime = 24;
        }else if(number==34){
            System.out.println("French Fry             80TK");
            System.out.println("Sub Sandwich           210TK");
            total_price = 80+210;
             totalPrepTime = 24;
        }else if(number==123){
            System.out.println("Pizza                  555TK");
            System.out.println("Burger                 180TK");
            System.out.println("French Fry             80TK");
            total_price = 555+180+80;
             totalPrepTime = 35;
        }else if(number == 234){
            System.out.println("Burger                 180TK");
            System.out.println("French Fry             80TK");
            System.out.println("Sub Sandwich           210TK");
            total_price = 180+80+210;
             totalPrepTime = 24;
        }else if(number == 134){
            System.out.println("Pizza                  555TK");
            System.out.println("French Fry             80TK");
            System.out.println("Sub Sandwich           210TK");
            total_price = 555+80+210;
             totalPrepTime = 35;
        }else if(number == 124){
            System.out.println("Pizza                  555TK");
            System.out.println("Burger                 180TK");
            System.out.println("Sub Sandwich           210TK");
            total_price = 555+180+210;
             totalPrepTime = 35;
        }else if(number == 1234){
             System.out.println("Pizza                 555TK");
            System.out.println("Burger                 180TK");
            System.out.println("French Fry             80TK");
            System.out.println("Sub Sandwich           210TK");
            total_price = 555+180+80+210;
             totalPrepTime = 35;
        }
        System.out.println("----------------------------------------");
        double vat = (total_price * 0.12);
        double totalPay = total_price + vat;
        System.out.println("Total price: " + total_price + "TK");
        System.out.println("VAT: " + vat + "TK");
        System.out.println("Total Payable Amount: " + totalPay + "TK");
        System.out.println("Time required to prepare food: " + totalPrepTime + " min");
        }
}
