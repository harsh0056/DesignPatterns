package adapter;

import adapter.YesBankApi.YesbankApi;

public class YesbankApiAdapter implements  BankApi{


    private YesbankApi yesbankApi;

    public YesbankApiAdapter(YesbankApi yesbankApi){
        this.yesbankApi = yesbankApi;
    }


    @Override
    public void addAccount(String accountNumber, String name, double balance) {
        yesbankApi.addAccount(accountNumber,name,balance);
        System.out.println("Account added successfully in from yesbank api");
    }

    @Override
    public double checkBalance(String accountNumber) {
        System.out.println("Checking balance from yesbank api");
        System.out.println("Account Number: "+accountNumber+" has Balance: "+yesbankApi.checkBalance(accountNumber).getAmount());
        return yesbankApi.checkBalance(accountNumber).getAmount();
    }

    @Override
    public void paySomeone(String debitAccountNumber,String creditAccountNumber,double amount) {
            yesbankApi.paySomeone(debitAccountNumber,creditAccountNumber,amount);

    }

    @Override
    public void recieveMoney(String debitAccountNumber,String creditAccountNumber,double amount) {
            yesbankApi.receiveMoney(debitAccountNumber,creditAccountNumber,amount);
    }
}
