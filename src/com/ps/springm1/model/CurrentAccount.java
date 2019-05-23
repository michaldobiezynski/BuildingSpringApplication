package com.ps.springm1.model;

import com.ps.springm1.Account;
import com.ps.springm1.Card;

public class CurrentAccount implements Account {

    private Card creditCard;

    public void setCreditCard(Card creditCard) {
        this.creditCard = creditCard;
    }

    public Card getCreditCard() {
        return creditCard;
    }

    @Override
    public String createAccount() {
        return "Current Account Created Successfully.";
    }

    @Override
    public String cardDetails() {
        return this.creditCard.cardDetails();
    }
}
