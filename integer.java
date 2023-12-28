import java.util.Scanner;
public class integer {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num;
    System.out.print("Enter a number: ");
    num = input.nextInt();
    if(num % 2 != 0){
        System.out.println("Weird");
    }else if(num % 2 == 0 && 2<= num && num<=5){
        System.out.println("Not Weird");
    }else if(num % 2 == 0 && 6<= num && num<=20){
        System.out.println("Weird");
    }else if(num % 2 ==0 && num>20){
        System.out.println("Not Weird");
    }
  }  
}
