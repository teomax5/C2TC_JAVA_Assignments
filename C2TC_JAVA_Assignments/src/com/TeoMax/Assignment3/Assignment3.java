package com.TeoMax.Assignment3;
public class Assignment3 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("John Doe", 5000);
        CheckingAccount checking = new CheckingAccount("Jane Doe", 3000);

        System.out.println("Total accounts: " + Bank.getTotalAccounts());

        savings.deposit(1000);
        savings.withdraw(700);
        System.out.println("Savings Balance: " + savings.getBalance());

        checking.deposit(500);
        checking.withdraw(400);
        System.out.println("Checking Balance: " + checking.getBalance());

        Transaction t = new Transaction();
        t.performTransaction("Savings to Checking", 1000);
    }
}
