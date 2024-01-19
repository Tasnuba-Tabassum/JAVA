import java.util.Scanner;
public class methodFibonacci {
    static void fibonacci(int num){
        int firstnum = 0, secondnum = 1;
        int nextnum = 0;
        System.out.print("Fibonacci series of " + num +" terms are: " );
        for(int i=0;i<=num;i++){
        System.out.print(firstnum + " ");
        nextnum = firstnum + secondnum;
        firstnum = secondnum;
        secondnum = nextnum;}
    }
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of terms: ");
    int num = input.nextInt();
    fibonacci(num);
}
}