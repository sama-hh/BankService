package org.example;

import java.math.BigDecimal;

public class Account {
    private String accountNumber;
    private BigDecimal accountBalance;
    private Client client;

    public Account(String accountNumber, BigDecimal accountBalance, Client client) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.client = client;
    }

    public void deposit(BigDecimal amount) {
        accountBalance = accountBalance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        accountBalance = accountBalance.subtract(amount);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", client=" + client +
                '}';
    }
}
