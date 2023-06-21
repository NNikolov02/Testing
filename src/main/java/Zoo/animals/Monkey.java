package Zoo.animals;

public class Monkey extends Animal implements Abilities {

    int numBananas;
    public Monkey(String name,int age,int mass,int numBananas){
        super(name, age, mass);
        this.numBananas = numBananas;
    }

    public String abilities(){
        return "UGAUGA";
    }
    public String feed(){
        return "The monkey is fed";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
