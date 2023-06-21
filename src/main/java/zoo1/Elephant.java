package zoo1;

public class Elephant extends Animal{

    double tuskLength;

    public Elephant(String name, int age, double tuskLength){
        super( name, age);
        this.tuskLength = tuskLength;

    }

    public double getTuskLength() {
        return tuskLength;
    }

    public void setTuskLength(double tuskLength) {
        this.tuskLength = tuskLength;
    }

    @Override
    public void makeSound() {
        System.out.println("UUUUUU");
    }

    @Override
    public void move() {
        System.out.println("Elephant is moving");
    }
}
