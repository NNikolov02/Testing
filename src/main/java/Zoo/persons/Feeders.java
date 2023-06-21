package Zoo.persons;

public class Feeders extends Employe implements Role{

    public Feeders(String name,int age){
        super(name, age);
    }


    public String role() {
        return "feed the animals";
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
