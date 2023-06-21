package zoo1;

public class Snake extends Animal{

    boolean isVenomous;

    public Snake(String name, int age, boolean isVenomous){
        super( name, age);
        this.isVenomous = isVenomous;

    }

    public boolean isVenomous() {
        return isVenomous;
    }

    public void setVenomous(boolean venomous) {
        isVenomous = venomous;
    }

    @Override
    public void makeSound() {
        System.out.println("SSSSSSSS");
    }

    @Override
    public void move() {
        System.out.println("Snake is moving");
    }
}
