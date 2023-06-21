package carrentallsystem;

public class Car {
   String registrationNumber;
    String brand;
    int rentalRatePerDay;
    String model;
    boolean isAvailable;
    Customer renter;

    public Customer getRenter() {
        return renter;
    }

    public void setRenter(Customer renter) {
        this.renter = renter;
    }

    public Car(String registrationNumber, String brand, int rentalRatePerDay, String model, boolean isAvailable) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.rentalRatePerDay = rentalRatePerDay;
        this.model = model;
        this.isAvailable = isAvailable;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRentalRatePerDay() {
        return rentalRatePerDay;
    }

    public void setRentalRatePerDay(int rentalRatePerDay) {
        this.rentalRatePerDay = rentalRatePerDay;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


}
