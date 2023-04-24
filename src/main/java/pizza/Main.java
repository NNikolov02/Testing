package pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza = new Mozzarella(pizza);
        pizza = new Salami(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());


    }
}
