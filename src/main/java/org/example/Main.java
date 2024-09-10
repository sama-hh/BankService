package org.example;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Anar", "John", "324732040" );
        Client client2 = new Client("John", "Doe", "524234540" );
        Client client3 = new Client("Kate", "Smith", "624733450" );
        Accounts accounts =  new Accounts();

        BankService bankService = new BankService();
        bankService.openAccount(client1);
        bankService.openAccount(client2);
        bankService.openAccount(client3);

        bankService.printAccounts();

    }
}