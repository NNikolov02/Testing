package lib;

import java.util.ArrayList;

public class LibrarySimulation {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Item item = new Book("Lubov","Ivan","Available");
        Item item1 = new Book("Smurt","Gosho","Unavailable");
        items.add(item);
        items.add(item1);

        Library library = new Library();
        library.add(item);
        library.add(item1);
        library.display();
        Book book = new Book("Zdrach","Ivan","Available");
        book.borrowing(book);
        LibraryCatalog catalog = new LibraryCatalog(items);
        catalog.searchByName("Lubov");
    }
}
