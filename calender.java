import java.util.Calendar;
public class calender {
    public static void main(String[] args) {
    Calendar input = Calendar.getInstance();
    System.out.println("Year: " + input.get(Calendar.YEAR));
    System.out.println("Month: " + (input.get(Calendar.MONTH) + 1));
    System.out.println("Day: " + input.get(Calendar.DATE));
    System.out.println("Hour: " + input.get(Calendar.HOUR)); 
    System.out.println("Minute: " + input.get(Calendar.MINUTE));
    }
}
