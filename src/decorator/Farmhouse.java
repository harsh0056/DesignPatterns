package decorator;


public class Farmhouse implements  Pizza{

    private Pizza pizza;

    public Farmhouse(){

    }

    public Farmhouse(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public int getCost() {
        if(pizza != null){
            return pizza.getCost() + 150;
        }
        return 150;
    }

    @Override
    public String getDescription() {


        if(pizza != null){
            return pizza.getDescription() + " + Farmhouse";
        }
        return "Farmhouse";

    }
}
