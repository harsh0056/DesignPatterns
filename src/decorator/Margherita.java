package decorator;

public class Margherita implements  Pizza{

    private Pizza pizza;

    public Margherita(){

    }

    public Margherita(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        if(pizza != null){
            return pizza.getCost() + 200;
        }
        return 200;
    }

    @Override
    public String getDescription() {
        if(pizza != null){
            return pizza.getDescription() + " + Margherita";
        }
        return "Margherita";
    }



}
