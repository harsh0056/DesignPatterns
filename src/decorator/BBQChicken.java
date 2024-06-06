package decorator;

public class BBQChicken implements Pizza {

    private Pizza pizza;

    public BBQChicken(){

    }

    public BBQChicken(Pizza pizza) {
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
            return pizza.getDescription() + " + BBQ Chicken";
        }

        return "BBQ Chicken";

    }
}
