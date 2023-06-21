package Restaurant;

import java.util.ArrayList;

public class Menu {

    private ArrayList<Dish> dishes;

    public Menu() {
        dishes = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void removeDish(Dish dish) {
        dishes.remove(dish);
    }

    public ArrayList<Dish> searchByName(String name) {
        ArrayList<Dish> result = new ArrayList<>();
        for (Dish dish : dishes) {
            //if (dish.getName().equalsIgnoreCase(name)) {
                result.add(dish);
            }



        return result;
    }
    public void display() {
        System.out.println("Menu:");
        for (Dish dish : dishes) {
            System.out.println(dish);
        }
    }


}

