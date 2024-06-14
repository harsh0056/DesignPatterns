package observer;

public class EmailSender implements OrderPlacedSubscriber {


    public EmailSender() {
        Amazon.getInstance().registerOnOrderPlaced(this);
    }


    @Override
    public void onOrderPlaced() {
        System.out.println("Sending emails as order has been placed!");
    }
}
