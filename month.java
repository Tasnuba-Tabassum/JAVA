import java.util.Scanner;
public class month {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String month;
        System.out.print("Enter month: ");
        month = input.nextLine();
        if(month.equals("january")){
            System.out.println("31 days");
        }else if(month.equals("february")){
            System.out.println("28 days");
        }else if(month.equals("march")){
            System.out.println("31 days");
        }else if(month.equals("april")){
                System.out.println("30 days");
        }else if(month.equals("may")){
            System.out.println("31 days");
        }else if(month.equals("june")){
            System.out.println("30 days");
        }else if(month.equals("july")){
            System.out.println("31 days");
        }else if(month.equals("august")){
            System.out.println("31 days");
        }else if(month.equals("september")){
            System.out.println("30 days");
        }else if(month.equals("october")){
            System.out.println("31 days");
        }else if(month.equals("november")){
            System.out.println(" 30 days");
        }else if(month.equals("december")){
            System.out.println("31 days");
        }
    }
}