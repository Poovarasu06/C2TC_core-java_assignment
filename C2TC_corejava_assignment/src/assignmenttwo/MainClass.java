package assignmenttwo;
/**
 * Main class to test Student and Commission classes.
 */
public class MainClass {
    public static void main(String[] args) {
        // Create Student object (will call default constructor)
        Student s = new Student();

        // Create Commission object
        Commission c = new Commission();
        c.acceptDetails();
        c.calculateCommission();
    }
}
