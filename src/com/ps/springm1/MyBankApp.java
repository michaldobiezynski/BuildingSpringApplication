package com.ps.springm1;

import com.ps.springm1.model.CurrentAccount;
import com.ps.springm1.model.SavingAccount;

public class MyBankApp {
    public static void main(String []args) {

        //SavingAccount account = new SavingAccount();
       // Account account = new SavingAccount();
        Account account = new CurrentAccount();
        System.out.println(account.createAccount());
    }
}
