package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(137, "Iago", 1000.00);
        acc.withdraw(100.00);
    }
}