package decorator;


public class Tomato implements Pizza{

    private Pizza pizza;

    public Tomato(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" + Tomato";
    }
}

