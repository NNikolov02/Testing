package carrentallsystem;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        Car car = new Car("PA6576","Audi",100,"RS6",true);
        Car car1 = new Car("PA5949","BMW",90,"M3",true);
        Car car2 = new Car("PA0007","Mercedes",120,"E-class",true);
        cars.add(car);
        cars.add(car1);
        cars.add(car2);


        ArrayList<Customer> customers = new ArrayList<>();
        Customer customer = new Customer(201221012,"Nikola","Sofia",false);
        Customer customer1 = new Customer(201221023,"Peter","Sofia",false);
        Customer customer2 = new Customer(201221043,"Ivan","Plovdiv",false);
        customers.add(customer);
        customers.add(customer1);
        customers.add(customer2);

        CarRentalAgency carRentalAgency = new CarRentalAgency("Skorost","Sofia");
        carRentalAgency.rentCar(customer,car);
        carRentalAgency.rentCar(customer1,car1);
        carRentalAgency.rentCar(customer1,car1);
        carRentalAgency.searchCar("PA0007");



    }
}
