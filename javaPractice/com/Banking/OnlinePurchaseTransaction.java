package com.Banking;
class  OnlinePurchaseTransaction extends Transaction{
    private String merchant;

    public OnlinePurchaseTransaction(int transactionId, double amount, String merchant)
    {
        super(transactionId,amount);
        this.merchant = merchant;
    }
    String getMerchant(){
        return merchant;
    }
}