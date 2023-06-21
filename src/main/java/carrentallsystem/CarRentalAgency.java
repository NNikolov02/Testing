package carrentallsystem;

import java.util.ArrayList;

public class CarRentalAgency {
    private String name;
    private String address;
    private ArrayList<Car> cars;

    public CarRentalAgency(String name, String address) {
        this.name = name;
        this.address = address;
        cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public void searchCar(String registrationNumber) {
        for (Car car : cars) {
            if (car.getRegistrationNumber().equals(registrationNumber)) {
                System.out.println("Car{" +
                        "registrationNumber='" + car.getRegistrationNumber() + '\'' +
                        ", brand='" + car.getBrand() + '\'' +
                        ", rentalRatePerDay=" + car.getRentalRatePerDay() +
                        ", model='" + car.getModel() + '\'' +
                        ", isAvailable=" + car.isAvailable() +
                        '}');

            }
        }
        System.out.println("There is no such car!");
    }

    public void rentCar(Customer customer, Car car) {
        if (!customer.isRented()) {
            if (car.isAvailable()) {
                car.setAvailable(false); // Set the car as unavailable when rented
                car.setRenter(customer); // Set the renter to the customer who rented the car
                customer.setRented(true);
                System.out.println("Car rented successfully!");
            } else {
                System.out.println("The car is not available for rent.");
            }
        } else {
            System.out.println("Customer has already rented a car!");
        }
    }

    public void returnCar(Customer customer, Car car) {
        if (customer.isRented()) {
            if (!car.isAvailable()) {
                car.setAvailable(true);
                car.setRenter(null); // Set the renter to null to indicate the car is not rented
                customer.setRented(false);
                System.out.println("Car returned successfully!");
            } else {
                System.out.println("The car is not rented by the customer.");
            }
        } else {
            System.out.println("Customer has not rented a car!");
        }
    }
    public void displayAvailableCars() {
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println("Car{" +
                        "registrationNumber='" + car.getRegistrationNumber() + '\'' +
                        ", brand='" + car.getBrand() + '\'' +
                        ", rentalRatePerDay=" + car.getRentalRatePerDay() +
                        ", model='" + car.getModel() + '\'' +
                        ", isAvailable=" + car.isAvailable() +
                        '}');
            }
        }
    }

    public void displayRentedCars() {
        for (Car car : cars) {
            if (!car.isAvailable()) {
                System.out.println("Car{" +
                        "registrationNumber='" + car.getRegistrationNumber() + '\'' +
                        ", brand='" + car.getBrand() + '\'' +
                        ", rentalRatePerDay=" + car.getRentalRatePerDay() +
                        ", model='" + car.getModel() + '\'' +
                        ", isAvailable=" + car.isAvailable() +
                        '}');
            }
        }
    }
}
