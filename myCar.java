public class myCar {
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  public static void main(String[] args) {
    myCar myCar = new myCar(); 
    myCar.fullThrottle();    
    myCar.speed(200);   
  }
}

// The car is going as fast as it can!
// Max speed is: 200