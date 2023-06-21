package zoo1;

public class Lion extends Animal{

    String maneColor;

    public Lion(String name, int age,String maneColor){
        super( name, age);
        this.maneColor = maneColor;

    }

    public String getManeColor() {
        return maneColor;
    }

    public void setManeColor(String maneColor) {
        this.maneColor = maneColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Roaaarrr");
    }

    @Override
    public void move() {
        System.out.println("Lion is moving");
    }


}
