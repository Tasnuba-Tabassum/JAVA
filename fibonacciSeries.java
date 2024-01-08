import java.util.Scanner;
public class fibonacciSeries {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of terms: ");
    int number = input.nextInt();
    int firstnum = 0, secondnum = 1;
    int nextnum = 0;
    System.out.print("Fibonacci series of " + number +" terms are: " );
    for(int i=0;i<=number;i++){
    System.out.print(firstnum + " ");
    nextnum = firstnum + secondnum;
    firstnum = secondnum;
    secondnum = nextnum;}
  }  
}
