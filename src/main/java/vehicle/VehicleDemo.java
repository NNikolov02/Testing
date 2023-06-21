package vehicle;

import java.util.ArrayList;

public class VehicleDemo {

    public static void main(String[] args) {


        ArrayList<Vehicle> vehicle = new ArrayList<>();



        System.out.println(vehicle);

        for(Vehicle vehicles:vehicle){
            if(vehicles instanceof Car){
                Car cars = (Car) vehicles;
                cars.toString();


            }
            if(vehicles instanceof Motorcycle){
                Motorcycle motorcycle = (Motorcycle) vehicles;
                motorcycle.start();
                motorcycle.toString();
            }
            if(vehicles instanceof Truck){
                Truck truck = (Truck) vehicles;
                truck.start();
                truck.toString();
            }
        }
    }
}
