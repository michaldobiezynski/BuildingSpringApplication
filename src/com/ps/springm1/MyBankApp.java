package com.ps.springm1;

import com.ps.springm1.model.SavingAccount;

public class MyBankApp {
    public static void main(String []args) {

        SavingAccount account = new SavingAccount();
        System.out.println(account.createAccount());
    }
}
