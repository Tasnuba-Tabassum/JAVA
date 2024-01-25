import java.util.Scanner;
public class watermelon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter the weight: ");
        number = input.nextInt();
        if (number >= 1 && number <= 100) {
          if (number > 2 && number % 2 == 0) {
            System.out.println("YES");
          } else {
            System.out.println("NO");
          }
        }
    }
}
