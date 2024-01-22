public class Book {
    String title;
    String author;
    int stock;
    int yearOfPublish;

    public Book(String title1, String author1, int stock1, int yearOfPublish1){
        title = title1;
        author = author1;
        stock = stock1;
        yearOfPublish = yearOfPublish1;
    }
    public void display(){
        System.out.println("Title of the book: " + title);
        System.out.println("Name of the author: " + author);
        System.out.println("In Stock: "+ stock + " pieces");
        System.out.println("Year of publish: " + yearOfPublish);
    }
    public void available(){
        System.out.println(stock);
    }
    public void sellBook(int quantity){
        stock -= quantity;
    }
    public static void main(String[] args){
        Book record1 = new Book("The Richest Man In Babylon", "George Clason", 40, 1926);
        record1.display();
        record1.available();
        record1.sellBook(5);
        record1.display();
    }
}
