package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Anar", "John", "324732040000" );
        Client client2 = new Client("John", "Doe", "524234540000" );
        Client client3 = new Client("Kate", "Smith", "624733450000" );

        BankService bankService = new BankService();
        bankService.openAccount(client1);
        bankService.openAccount(client2);
        bankService.openAccount(client3);

        bankService.printAccounts();


    }
}