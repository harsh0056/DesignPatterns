package adapter;

import adapter.YesBankApi.YesBankAPiImple;
import adapter.YesBankApi.YesbankApi;

public class Client {

    public static void main(String[] args) {


        YesbankApi yesbankApi = new YesBankAPiImple();

        BankApi bankApi = new YesbankApiAdapter(yesbankApi);

        Phonepe phonepe = new Phonepe(bankApi);

        phonepe.perFormTransaction();


    }
}
