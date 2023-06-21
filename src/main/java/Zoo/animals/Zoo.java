package Zoo.animals;

import java.util.ArrayList;

public class Zoo {

    String name;
   public static ArrayList<Animal> animalzoo = new ArrayList<>();

    public Zoo(String name){
        this.name = name;
        animalzoo = new ArrayList<Animal>();

    }

    public void addAnimal(Animal animal){
        animalzoo.add(animal);
    }
    public void feedAllAnimals(){

        for (Animal animals:animalzoo){

        }
    }
}
