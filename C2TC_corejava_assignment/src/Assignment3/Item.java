package Assignment3;


/**
 * Base class representing an Item with id and title.
 */
public class Item {
    protected int id;
    protected String title;

    public Item(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public void displayInfo() {
        System.out.println("Item [ID: " + id + ", Title: " + title + "]");
    }
}
