public class constructor3 {
  int modelYear;
  String modelName;

    public constructor3(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    constructor3 myCar = new constructor3(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}
