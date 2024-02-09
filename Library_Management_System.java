import java.util.Scanner;
public class Library_Management_System {
   String title;
   String author;
   Boolean checkedOut = false;
   public Library_Management_System(String title1, String author1){
   title = title1;
   author = author1;
   }
   public  String getTitle() {
    return title;
   }
   public String getAuthor() {
    return author;
   }
   public boolean isCheckedOut() {
    return checkedOut;
   }
   public void checkOut() {
    if (checkedOut == false) {
        System.out.println("Book checked out successfully.");
        checkedOut = true;
    } else {
        System.out.println("Book is already checked out.");
    }
    }
    public void returnBook() {
        if (checkedOut == true) {
            System.out.println("Book returned successfully.");
            checkedOut = false;
        } else {
            System.out.println("Book is already available.");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = input.nextLine();

        System.out.print("Enter book author: ");
        String author = input.nextLine();
        Library_Management_System record1 = new Library_Management_System(title, author);
        System.out.println(record1.getTitle());
        System.out.println(record1.getAuthor());
        System.out.println(record1.isCheckedOut());
        record1.checkOut(); 
        record1.returnBook();
    }
}