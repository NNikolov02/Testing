package carrentallsystem;

public class Customer {

    int customerId;
    String name;
    String address;
    boolean isRented;


    public Customer(int customerId, String name, String address,boolean isRented) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.isRented = isRented;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean Rented) {
        this.isRented = Rented;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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
}
