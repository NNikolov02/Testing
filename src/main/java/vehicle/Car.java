package vehicle;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;


public class Car extends Vehicle {

    int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }


    @Override
    public void start() {
        System.out.println("The car has started!");

    }

    @Override
    public String toString() {
        return "Car{" +
                "numDoors=" + numDoors +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
