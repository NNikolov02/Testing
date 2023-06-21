package zoo1;

public class main {
    public static void main(String[] args) {
        Animal animal = new Lion("Mufasa",3,"yellow");
        Animal animal1= new Snake("John",2,true);
        Animal animal2 = new Elephant("Eric",4,22.33);


        Zoo zoo = new Zoo();
        zoo.addAnimal(animal);
        zoo.addAnimal(animal1);
        zoo.addAnimal(animal2);
        zoo.displayAnimal();
        zoo.removeAnimal(animal1);
        zoo.displayAnimal();

        ZooKeeper zooKeeper = new ZooKeeperIml();
        zooKeeper.cleanEnclosure(animal);
        zooKeeper.feedAnimal(animal2);
    }
}
