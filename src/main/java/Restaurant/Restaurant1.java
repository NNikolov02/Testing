package Restaurant;

import java.util.ArrayList;

public class Restaurant1 {
    private String name;
    private Menu menu;


    public Restaurant1(String name) {
        this.name = name;
        this.menu = new Menu();

    }

    public void addDish(Dish dish) {
        menu.addDish(dish);
    }

    public void removeDish(Dish dish) {
        menu.removeDish(dish);
    }

    public ArrayList<Dish> searchDishesByName(String name) {
        return menu.searchByName(name);
    }


    public void displayMenu() {
        menu.display();
    }

}