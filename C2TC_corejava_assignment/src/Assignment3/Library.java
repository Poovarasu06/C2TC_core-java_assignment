package Assignment3;

import java.util.ArrayList;
import java.util.List;

/**
 * Library class demonstrates composition (has-a relationship).
 */
public class Library {
    private List<Item> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void showAllItems() {
        System.out.println("Library contains:");
        for (Item item : items) {
            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.println("- " + book.title + " by " + book.getAuthor());
            } else if (item instanceof Magazine) {
                Magazine mag = (Magazine) item;
                System.out.println("- " + mag.title + " Issue " + mag.getIssueNumber());
            }
        }
    }
}
