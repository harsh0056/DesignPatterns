package adapter;

public interface BankApi {
    //this is the interface that phonepe uses

    void addAccount(String acccountNUmber, String name, double balance);

    double checkBalance(String accountNumber);

    void paySomeone(String debitAccountNumber,String creditAccountNumber,double amount);

    void recieveMoney(String debitAccountNumber,String creditAccountNumber,double amount);




}
