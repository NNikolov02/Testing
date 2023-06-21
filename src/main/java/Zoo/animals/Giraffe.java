package Zoo.animals;

public class Giraffe extends Animal implements Abilities {

    double neckLength;
    public Giraffe(String name, int age, int mass,double neckLength) {
        super(name, age, mass);
        this.neckLength = neckLength;
    }

    public String abilities() {
        return "Kh Kh Kh";
    }
    public String feed(){
        return "The Giraffe is fed";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}