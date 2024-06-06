package adapter;

public class Phonepe {

    private BankApi bankApi;

    public Phonepe(BankApi bankApi){
        this.bankApi = bankApi;
    }

    public  void perFormTransaction(){
            bankApi.addAccount("12345","Harsh",1000);
            bankApi.addAccount("12346","Sanjay",1000);
            bankApi.addAccount("12347","Rahul",1000);

            if(bankApi.checkBalance("12345")>500){
                bankApi.paySomeone("12345","12346",500);
                System.out.println("debit account new balance is "+bankApi.checkBalance("12345"));
                System.out.println("credit account new balance is "+bankApi.checkBalance("12346"));
            }else{
                System.out.println("Insufficient Balance");
            }



    }

}
