package pizza;

public class Salami implements Pizza{
    Pizza pizza;
    public  Salami(Pizza pizza){
        this.pizza = pizza;
    }


    public String getDescription() {
        return pizza.getDescription() + " " + "with"+ " " + "Salami";
    }


    public Float getCost() {
        return pizza.getCost() + 2.5F;
    }
}
