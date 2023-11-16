package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(137, "Iago", 1000.00);
        BusinessAccount bacc = new BusinessAccount(144, "Geovana", 1500.00, 500.00);

        //UPCASTING

        Account acc1 = bacc;
        // |---> Não dá erro por conta que uma BussinessAccount também é uma Account
        Account acc2 = new BusinessAccount(199, "João", 0.0, 200.00);

        Account acc3 = new SavingsAccount(201, "Bob", 0.0, 0.01);
        // |---> Não dá erro por conta que uma SavingsAccount também é uma Account

        //DOWNCASTING

        BusinessAccount acc4 =  (BusinessAccount) acc2;
        //Tem que fazer um casting manual para poder fazer o downcasting
        acc4.loan(100.00);


        //BusinessAccount acc5 = (BusinessAccount)  acc3;
        //Exception in thread "main" java.lang.ClassCastException
        //Ou seja, em tempo de execução o programa tentou fazer a conversão e viu que não dava
        //Porém, o compilador não percebe isso antes (na hora de codar, no caso)

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)  acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        Account acc10 = new Account(1099, "Mario", 1000.00);
        BusinessAccount acc11 = new BusinessAccount(902, "Maria", 1000.00, 150.00);
        SavingsAccount acc12 = new SavingsAccount(222, "Ana", 1000.00, 0.01);

        acc10.withdraw(200.00);
        acc11.withdraw(200.00);
        acc12.withdraw(200.00);

        System.out.println("Account: " + acc10.getBalance());
        System.out.println("BussinessAccount: " + acc11.getBalance());
        System.out.println("SavingsAccount: " + acc12.getBalance());

    }
}