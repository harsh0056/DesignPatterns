package adapter.YesBankApi;

public class Balance {

    public double getAmount() {
        return amount;
    }

    public Balance(double amount) {
        this.amount = amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private   double amount ;
}
