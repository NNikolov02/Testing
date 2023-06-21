package OnlineStore;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {

    String name;
    String desription;

    double prize;
    String stockquantity;

    public Product(String name, String desription, double prize, String stockquantity) {
        this.name = name;
        this.desription = desription;
        this.prize = prize;
        this.stockquantity = stockquantity;
    }
}
