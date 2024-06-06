package adapter.YesBankApi;

import java.util.HashMap;

public class YesBankAPiImple implements YesbankApi{

    private final HashMap<String,BankAccount> accounts = new HashMap<>();

    @Override
    public String addAccount(String acccountNUmber, String name,double balance) {
        BankAccount account = new BankAccount(acccountNUmber, name, balance);
        accounts.put(acccountNUmber, account);
        return "Account with account Number "+ account.getAccountNumber()+" created successfully with balance "+balance;
    }

    @Override
    public Balance checkBalance(String accountNumber) {
        BankAccount account;
        if(accounts.containsKey(accountNumber)){
            account = accounts.get(accountNumber);
            System.out.println("Account Number: "+account.getAccountNumber()+" Account Holder Name: "+account.getAccountHolderName()+" Balance: "+account.getBalance());
            return new Balance(account.getBalance());
        }
        System.out.println("Account with account number "+accountNumber+" does not exist");
        return new Balance(-1);
    }

    @Override
    public void addMoneyToAccount(String accountNumber, double amount) {
        if(accounts.containsKey(accountNumber)) {
            BankAccount account = accounts.get(accountNumber);
            account.setBalance(account.getBalance() + amount);
            System.out.println("Amount " + amount + " added to account with account number " + accountNumber);
        }else{
            System.out.println("Account with account number "+accountNumber+" does not exist");

        }
    }

    @Override
    public void paySomeone(String debitAccountNumber, String creditAccountNumber, double amount) {

        BankAccount debitAccount = accounts.get(debitAccountNumber);
        BankAccount creditAccount= accounts.get(creditAccountNumber);

        if(debitAccount == null){
            System.out.println("Debit account with account number "+debitAccountNumber+" does not exist");
            return;
        }
        if(creditAccount == null){
            System.out.println("Credit account with account number "+creditAccountNumber+" does not exist");
            return;
        }

        if(debitAccount.getBalance() < amount){
            System.out.println("Insufficient balance in account with account number "+debitAccountNumber+"Try Adding Funds to Account");
            return;
        }else{
            debitAccount.setBalance(debitAccount.getBalance()-amount);
            creditAccount.setBalance(creditAccount.getBalance()+amount);
            System.out.println("Amount "+amount+" transferred from account with account number "+debitAccountNumber+" to account with account number "+creditAccountNumber);
        }

    }

    @Override
    public void receiveMoney(String debitAccountNumber, String creditAccountNumber, double amount) {
        BankAccount debitAccount = accounts.get(debitAccountNumber);
        BankAccount creditAccount= accounts.get(creditAccountNumber);

        if(debitAccount == null){
            System.out.println("Debit account with account number "+debitAccountNumber+" does not exist");
            return;
        }
        if(creditAccount == null){
            System.out.println("Credit account with account number "+creditAccountNumber+" does not exist");
            return;
        }
        if(creditAccount.getBalance() < amount) {
            System.out.println("Insufficient balance in account with account number " + creditAccountNumber + "Try Adding Funds to Account");
            return;
        }else{
            creditAccount.setBalance(creditAccount.getBalance()-amount);
            debitAccount.setBalance(debitAccount.getBalance()+amount);
            System.out.println("Amount "+amount+" transferred from account with account number "+creditAccountNumber+" to account with account number "+debitAccountNumber);
        }


    }
}
