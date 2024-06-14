package observer;

public class AnalyticsSender implements OrderPlacedSubscriber {


    public AnalyticsSender() {
        Amazon.getInstance().registerOnOrderPlaced(this);
    }

    @Override
    public void onOrderPlaced() {
        System.out.println("Sending analytics events as order has been placed!");
    }
}
