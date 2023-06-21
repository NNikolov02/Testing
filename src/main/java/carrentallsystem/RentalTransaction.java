package carrentallsystem;

import java.util.ArrayList;

public class RentalTransaction {

    Customer customer;
    Car car;
    String rentalStartDate;
    String rentalEndDate;
    int totalRentalCost;
    private ArrayList<Car> cars = new ArrayList<>();

    public RentalTransaction(Customer customer, Car car, String rentalStartDate, String rentalEndDate, int totalRentalCost) {
        this.customer = customer;
        this.car = car;
        this.rentalStartDate = rentalStartDate;
        this.rentalEndDate = rentalEndDate;
        this.totalRentalCost = totalRentalCost;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getRentalStartDate() {
        return rentalStartDate;
    }

    public void setRentalStartDate(String rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public String getRentalEndDate() {
        return rentalEndDate;
    }

    public void setRentalEndDate(String rentalEndDate) {
        this.rentalEndDate = rentalEndDate;
    }

    public int getTotalRentalCost() {
        return totalRentalCost;
    }

    public void setTotalRentalCost(int totalRentalCost) {
        this.totalRentalCost = totalRentalCost;
    }
    public double calculateRentalCost(Customer customer, int numberOfDays) {
        double totalCost = 0.0;

        for (Car car : cars) {
            if (car.isAvailable && !customer.isRented) {
                double rentalRatePerDay = car.getRentalRatePerDay();
                totalCost += rentalRatePerDay * numberOfDays;
            }
        }

        return totalCost;
    }
}
