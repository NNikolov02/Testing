package Zoo.persons;

public class Veterinar extends Employe implements Role{

    public Veterinar(String name,int age){
        super(name, age);
    }


    public String role() {
        return "cure the animals";
    }
    @Override
    public String toString() {
        return super.toString();
    }
}