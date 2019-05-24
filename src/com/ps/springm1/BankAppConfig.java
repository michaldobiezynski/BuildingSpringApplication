package com.ps.springm1;

import com.ps.springm1.model.CreditCard;
import com.ps.springm1.model.CurrentAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.Currency;

public class BankAppConfig {

    @Bean
    public CreditCard creditCard() {
        return new CreditCard();
    }

    @Bean(initMethod = "onInit", destroyMethod = "onDestroy")
    @Scope("prototype")
    public CurrentAccount currentAccount() {
        return new CurrentAccount();
    }

}
