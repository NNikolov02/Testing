package vehicle;

import lombok.Builder;
import lombok.Data;


public   class Vehicle {

    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start(){
        System.out.println("The Vehicle has started!");
    }
}
