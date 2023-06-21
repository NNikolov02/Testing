package lib;

import java.util.ArrayList;

public class LibraryCatalog  {

    ArrayList<Item> items = new ArrayList<>();

    public LibraryCatalog(ArrayList<Item> items) {
        this.items = items;
    }

    public void searchByName(String title){

        for(Item item1:items){
            if(title.equals(item1.getTitle())){
                System.out.println("Item{" +
                        "title='" + item1.getTitle() + '\'' +
                        ", creator='" + item1.getCreator() + '\'' +
                        ", status='" + item1.getStatus() + '\'' +
                        '}');
                break;
            }else{
                System.out.println("There is no such an item!");
            }
        }
    }

}
