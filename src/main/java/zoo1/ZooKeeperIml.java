package zoo1;

import java.util.ArrayList;

public class ZooKeeperIml implements ZooKeeper {

    @Override
    public void feedAnimal(Animal animal) {


        if (animal instanceof Lion) {
            System.out.println("Feed it with steak!");
        } else if (animal instanceof Snake) {
            System.out.println("Feed it with mouses!");
        } else if (animal instanceof Elephant) {
            System.out.println("Feed it with grass!");


        }
    }

    @Override
    public void cleanEnclosure(Animal animal) {
        if (animal instanceof Lion) {
            System.out.println("Clean the lions cage!");
        } else if (animal instanceof Snake) {
            System.out.println("Clean the snakes cage!");
        } else if (animal instanceof Elephant) {
            System.out.println("Clean the elephants cage!");


        }
    }
}
