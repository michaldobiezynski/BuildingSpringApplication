package com.ps.springm1.model;

import com.ps.springm1.Card;

public class CreditCard implements Card {

    @Override
    public String cardDetails() {
        return "Credit Card has been issued.";
    }
}
