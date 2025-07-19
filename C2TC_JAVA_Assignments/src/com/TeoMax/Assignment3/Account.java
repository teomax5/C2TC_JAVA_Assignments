package com.TeoMax.Assignment3;

abstract class Account {
    protected String accountHolder;
    protected double balance;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        Bank.incrementAccounts();  // Increase static counter
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited to Savings: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew from Savings: " + amount);
        } else {
            System.out.println("Insufficient Savings Balance!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

class CheckingAccount extends Account {
    public CheckingAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited to Checking: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew from Checking: " + amount);
        } else {
            System.out.println("Insufficient Checking Balance!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}