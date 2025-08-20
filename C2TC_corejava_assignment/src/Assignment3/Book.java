package Assignment3;

/**
 * 
 * Book class is-a Item, with an additional attribute author.
 */
public class Book extends Item {
    private String author;

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book [ID: " + id + ", Title: " + title + ", Author: " + author + "]");
    }

    public String getAuthor() {
        return author;
    }
}
