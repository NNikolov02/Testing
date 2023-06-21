package Restaurant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;





public class Appetizer extends Dish{

    String type;
    boolean vegetarian;


    public Appetizer(String name, String description, double price, String type, boolean vegetarian) {
        super(name, description, price);
        this.type = type;
        this.vegetarian = vegetarian;
    }
}
