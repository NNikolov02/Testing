package lib;

import java.util.ArrayList;

public class Book extends Item implements Borrowable{

    public Book(String title, String creator, String status) {
        super(title, creator, status);
    }
    public void borrowing(Item item) {
        ArrayList<Item> items = new ArrayList<>();
        for (Item item1 : items) {
            if (super.status.equals("Available")) {
                items.remove(item1);


            }else{
                System.out.println("There is not such an item!");
            }
        }
    }

    public void returning(Item item){
        ArrayList<Item> items = new ArrayList<>();
        for (Item item1 : items) {
            if (super.status.equals("Unavailable")) {
                items.remove(item1);


            }else{
                System.out.println("There is not such an item!");
            }
        }}
}
