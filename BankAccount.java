import java.util.Scanner;
public class BankAccount {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int accountNumber;
    String accountHolder;
    double balance;
    double withdraw;
    System.out.println("Welcome to XYZ Bank!!!");
    System.out.println("Create An Account.");
    System.out.print("Enter your name: ");
    accountHolder = input.nextLine();
    System.out.print("Enter the account number: ");
    accountNumber = input.nextInt();
    System.out.print("With what amount you want to create your account? $");
    balance = input.nextInt();
    System.out.println("Account Created Successfully!!!");
    System.out.println("Your current balance : $" + balance);
    System.out.print("Amount you want to withdraw: $");
    withdraw = input.nextInt();
    double leftMoney = (balance - withdraw);
    System.out.print("Current balance: $" + leftMoney);
    }
}
