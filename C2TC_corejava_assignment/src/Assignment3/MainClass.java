package Assignment3;

/**
 * Main class to demonstrate Inheritance and Composition in Java.
 */
public class MainClass {
    public static void main(String[] args) {
        // Part A - Inheritance
        Book b1 = new Book(101, "Java Basics", "James Gosling");
        Magazine m1 = new Magazine(201, "Tech Today", 45);

        b1.displayInfo();
        m1.displayInfo();

        // Part B - Composition
        Library library = new Library();
        library.addItem(b1);
        library.addItem(m1);

        library.showAllItems();
    }
}
