package org.example;

import java.util.HashMap;
import java.util.Map;

public class Accounts {
    private Map<String, Account> accounts;

    public Accounts() {
        accounts = new HashMap<>();
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void addAccount(String accountNumber, Account account) {
        accounts.put(accountNumber, account);
    }

    public void printAccounts() {
        for (Account account : accounts.values()) {
            System.out.println(account);
        }
    }
}
