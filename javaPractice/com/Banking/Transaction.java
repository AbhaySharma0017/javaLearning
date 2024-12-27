package com.Banking;
class Transaction{
    private int transactionId;
    private double amount;

   public Transaction(int transactionId, double amount)
    {
        this.transactionId = transactionId;
        this.amount = amount;
    }
    int getTransactionId(){
        return transactionId;
    }   
    double getAmount()
    {
        return amount;
    }
}