package com.ps.springm1.model;

import com.ps.springm1.Account;

public class CurrentAccount implements Account {
    @Override
    public String createAccount() {
        return "Current Account Created Successfully.";
    }

    @Override
    public String cardDetails() {
        return null;
    }
}
