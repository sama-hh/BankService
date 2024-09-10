package org.example;

import java.math.BigDecimal;
import java.util.Random;
import java.util.UUID;

public class BankService {
    Accounts accounts = new Accounts();

    public BankService() {
        this.accounts = new Accounts();
    }

    public String openAccount(Client client) {
        Random random = new Random();
        int randomNumber = random.nextInt(1000000000 - 100000000) + 100000000;
        String accountNumber = String.valueOf(randomNumber);

        Account account = new Account(accountNumber, new BigDecimal(0), client);
        accounts.addAccount(accountNumber, account);
        return accountNumber;
    }

    public void transfer(BigDecimal amount, String from, String to) {
        Account fromAccount = accounts.getAccount(from);
        Account toAccount = accounts.getAccount(to);

        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }

    public void printAccounts() {
        accounts.printAccounts();
    }
}
