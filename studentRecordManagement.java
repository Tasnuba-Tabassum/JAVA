public class studentRecordManagement {
    String studentid;
    String firstName;
    String lastName;
    String dateOfBirth;
    String major;
    double gpa = 0.00;
    String[] coursesCompleted = new String[10];
    String[] currentEnrollment = new String[10];

    public studentRecordManagement(String studentid1, String firstName1, String lastName1, String dateOfBirth1, String major1){
        studentid = studentid1;
        firstName = firstName1;
        lastName = lastName1;
        dateOfBirth = dateOfBirth1;
        major = major1;
    }
    public void display(){
        System.out.println("Student ID: " + studentid);
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
    public void completedcourse(String course){
        coursesCompleted[0] = course ;
    }
    public void currentcourse(String enroll){
        currentEnrollment[0] = enroll;
    }
    public void updatemajor(String major2){
        major = major2;
    }
    public static void main(String[] args) {
        studentRecordManagement record1 = new studentRecordManagement("23-53103-3", "Tasnuba", "Tabassum", "23-01-2003", "Cybersecurity");
        studentRecordManagement record2 = new studentRecordManagement("23-53117-3", "Jayna", "Tanjum", "31-10-2003", "Cybersecurity");
        record1.display();
        record2.display();
        record1.completedcourse("Introduction to Programming");
        record2.completedcourse("Introduction to Computer Studies");
        record1.currentcourse("Physics 2");
        record2.currentcourse("English");
        record1.updatemajor("Software Engineering");
        record1.display();
        record2.display();
    }
}
