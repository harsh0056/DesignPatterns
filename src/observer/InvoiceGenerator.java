package observer;

public class InvoiceGenerator implements OrderPlacedSubscriber {

    public InvoiceGenerator() {
        Amazon.getInstance().registerOnOrderPlaced(this);
    }

    @Override
    public void onOrderPlaced() {
        System.out.println("Generating invoice as order has been placed!");
    }
}
