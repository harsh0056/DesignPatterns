package adapter.YesBankApi;

public interface YesbankApi {

    String addAccount(String acccountNUmber, String name, double balance);

    Balance checkBalance(String accountNumber);

    void addMoneyToAccount(String accountNumber,double amount);

    void paySomeone(String debitAccount,String creditAccount,double amount);

    void receiveMoney(String debitAccount, String CreditAccount ,double amount);

}
