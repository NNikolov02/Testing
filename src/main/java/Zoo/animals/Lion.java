package Zoo.animals;

public class Lion extends Animal implements Abilities {

    String maneColor;

    public Lion(String name, int age, int mass,String maneColor) {
        super(name, age, mass);
        this.maneColor = maneColor;
    }

    public String abilities() {
        return "roaaar";
    }
    public String feed(){
        return "The lion is fed";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}