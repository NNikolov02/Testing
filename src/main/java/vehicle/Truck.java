package vehicle;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



public class Truck extends Vehicle{

    double cargoCapacity;


    public Truck(String make, String model, int year, double cargoCapacity) {
        super(make, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void start(){
        System.out.println("The truck has started!");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "cargoCapacity=" + cargoCapacity +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
