package pizza;

import java.sql.SQLOutput;

public class Mozzarella implements Pizza{
    Pizza pizza;
    public Mozzarella(Pizza pizza){
        this.pizza = pizza;
    }


    public String getDescription() {
        return pizza.getDescription() + " "+ "with" + " " +" Mozzarella";
    }


    public Float getCost() {
        return pizza.getCost() + 3.0F;
    }
    public void print(){
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
