package Zoo.persons;

public class Guards extends Employe implements Role{

    public Guards(String name,int age){
        super(name, age);
    }


    public String role() {
        return "defend the animals";
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
