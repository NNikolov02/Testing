package vehicle;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;


public class Motorcycle extends Vehicle{

    boolean hasSideCar;

    public Motorcycle(String make, String model, int year, boolean hasSideCar) {
        super(make, model, year);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void start(){
        System.out.println("The Motorcycle has started!");
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasSideCar=" + hasSideCar +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
