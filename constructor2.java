public class constructor2 {
    int x;

    public constructor2(int y) {
      x = y;
    }
  
    public static void main(String[] args) {
      constructor2 myObj = new constructor2(5);
      System.out.println(myObj.x);
    }
}
