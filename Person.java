import java.util.Calendar;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    String email;
    String phoneNumber;
    String address;

    public Person(String firstName1, String lastName1, int age1, String gender1, String email1, String phoneNumber1, String address1){
        firstName = firstName1;
        lastName = lastName1;
        age = age1;
        gender = gender1;
        email = email1;
        phoneNumber = phoneNumber1;
        address = address1;
    }
    public void display(){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
    public void birthday(){
        age++;
    }
    public void updateContact(String email2, String phoneNumber2, String address2){
        email = email2;
        phoneNumber = phoneNumber2;
        address = address2;
    }
    public void greeting(){
        Calendar input = Calendar.getInstance();
        int hour = input.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour);
        if (hour <= 12) {
            System.out.println("Good morning!");
        } else if (hour <= 18) {
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Good evening!");
        }
    }
    public void LegalAge() {
        if(age >= 18){
            System.out.println("This person is of legal age");
        }else{
            System.out.println("This person is not of legal age");
        }
    }
    public String FullName() {
        return firstName + " " + lastName;
    }
    public static void main(String[] args){
        Person record1 = new Person ("Tasnuba", "Tabassum", 20, "Female", "tasnubatabassum123@gmail.com", "01819992451", "Uttara,Dhaka");
        Person record2 = new Person ("Tausif", "Naim", 15, "Male", "tausif1232@gmail.com", "01234567890", "Uttara,Dhaka");
        record1.display();
        record2.display();
        record1.birthday();
        record2.birthday();
        record1.updateContact("tasnubataba321@gmail.com", "01619226218", "Mirpur, Dhaka");
        record2.updateContact("naimtausif111@gmail.com", "01918765443", "Agargaon,Dhaka");
        record1.greeting();
        record2.greeting();
        record1.LegalAge();
        record2.LegalAge();
        record1.FullName();
        record2.FullName();
        record1.display();
        record2.display();
    }
}