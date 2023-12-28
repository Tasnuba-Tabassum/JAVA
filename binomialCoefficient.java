import java.util.Scanner;
public class binomialCoefficient {
   public static void main(String[] args){
    Scanner input  = new Scanner(System.in);
    int n, r;
    System.out.print("Enter value of n: ");
    n = input.nextInt();
    System.out.print("Enter value of r: ");
    r = input.nextInt();
    int factorialn = 1;
        for (int i = 1; i <= n; i++) {
            factorialn *= i;
        }
        int factorialr = 1;
        for (int i = 1; i <= r; i++) {
            factorialr *= i;
        }
        int subs = (n - r);
    int factorialn_r = 1;
        for (int i = 1; i <= subs; i++) {
            factorialn_r *= i;
        }
        double denum = (factorialr * factorialn_r);
        System.out.println("Binomial Coefficient " + n + "C" +r + ": " + (factorialn / denum));

   } 
}
