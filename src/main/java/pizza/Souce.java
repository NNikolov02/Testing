package pizza;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Souce implements Pizza{
    Pizza pizza;


    @Override
    public String getDescription() {
        return pizza.getDescription() + "" + "Souce";
    }

    @Override
    public Float getCost() {
        return pizza.getCost() + 2.0F;
    }
}
