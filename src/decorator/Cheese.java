package decorator;


public class Cheese implements Pizza{

    private Pizza pizza;

    public Cheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 80;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" + Cheese";
    }
}

