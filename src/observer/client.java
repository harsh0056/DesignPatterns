package observer;

public class client {

    public static void main(String[] args) {
        Amazon amazon = Amazon.getInstance();
        EmailSender emailSender = new EmailSender();
        AnalyticsSender analyticsSender = new AnalyticsSender();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        amazon.orderPlaced();
    }

}
