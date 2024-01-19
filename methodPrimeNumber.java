import java.util.Scanner;
public class methodPrimeNumber {
    static void primenumber(int num){
        Boolean some = true;
        for(int i=2;i<num;i++){
            if(num%i == 0){
                some = false;
        }
        }if(some == true){
            System.out.print("True! This is a prime number.");
        }else{
            System.out.println("The number is not a prime number.");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        primenumber(num);
    }
}
