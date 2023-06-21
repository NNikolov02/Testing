package zoo1;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Zoo {

    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void removeAnimal(Animal animal){
        animals.remove(animal);
    }

    public void displayAnimal(){

        System.out.println("Display animals:");
        for(Animal animal:animals){

            if(animal instanceof Lion){
                System.out.println("{" +
                        "maneColor='" + ((Lion) animal).getManeColor() + '\'' +
                                ", name='" + animal.getName() + '\'' +
                                ", age=" + animal.getAge() +
                                '}');
            } else if(animal instanceof Snake) {

                System.out.println("{" +
                        "isVenomous='" + ((Snake) animal).isVenomous() + '\'' +
                        ", name='" + animal.getName() + '\'' +
                        ", age=" + animal.getAge() +
                        '}');

            }
            else if(animal instanceof Elephant){
                System.out.println("{" +
                        "tuskLength='" + ((Elephant) animal).getTuskLength() + '\'' +
                        ", name='" + animal.getName() + '\'' +
                        ", age=" + animal.getAge() +
                        '}');
            }
        }
    }
}
