package Restaurant;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;


public class Dessert extends  Dish{

    String type;

    boolean nuts;

    public Dessert(String name, String description, double prize, String type, boolean nuts) {
        super(name, description, prize);
        this.type = type;
        this.nuts = nuts;
    }
}
