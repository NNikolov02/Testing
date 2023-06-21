package Restaurant;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;


public class Entree extends Dish{

    String type;

    boolean spicy;

    public Entree(String name, String description, double prize, String type, boolean spicy) {
        super(name, description, prize);
        this.type = type;
        this.spicy = spicy;
    }
}
