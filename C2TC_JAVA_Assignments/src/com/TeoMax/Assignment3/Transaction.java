package com.TeoMax.Assignment3;

final class Transaction {
    private final double transactionFee = 10.0;

    public final void performTransaction(String transactionType, double amount) {
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Amount: " + amount);
        System.out.println("Transaction Fee: " + transactionFee);
        System.out.println("Transaction completed securely.\n");
    }
}