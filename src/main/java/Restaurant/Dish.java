package Restaurant;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;



public class Dish {
    String name;
    String description;
    double prize;

    public Dish(String name, String description, double prize) {
        this.name = name;
        this.description = description;
        this.prize = prize;
    }
}
