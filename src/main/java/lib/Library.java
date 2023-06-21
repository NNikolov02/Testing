package lib;

import java.util.ArrayList;

public class Library {

    ArrayList<Item> items =new ArrayList<>();

    public Library() {
        items = new ArrayList<>();
    }

    public void add(Item item){
        items.add(item);
    }
    public void remove(Item item){
        items.remove(item);
    }

    public void display(){
        System.out.println("Display items:");
        for(Item item1:items){
            System.out.println("Item{" +
                    "title='" + item1.getTitle() + '\'' +
                    ", creator='" + item1.getCreator() + '\'' +
                    ", status='" + item1.getStatus() + '\'' +
                    '}');

        }
    }

}
