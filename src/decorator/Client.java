package decorator;

public class Client {

    public static void main(String[] args) {

        Pizza pizza = new Paneer(new Cheese(new Tomato(new BBQChicken())));

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());



    }


}
