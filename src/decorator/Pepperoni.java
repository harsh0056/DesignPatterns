package decorator;

public class Pepperoni implements  Pizza{

        private Pizza pizza;

        public Pepperoni(){

        }

        public Pepperoni(Pizza pizza) {
            this.pizza = pizza;
        }


        @Override
        public int getCost() {
            if(pizza != null){
                return pizza.getCost() + 180;
            }
            return 180;
        }

        @Override
        public String getDescription() {

            if(pizza != null){
                return pizza.getDescription() + " + Pepperoni";
            }
            return "Pepperoni";

        }
    }
