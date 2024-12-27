package com.Banking;
class  BillPaymentTransaction extends Transaction{
    private String billType;

    public BillPaymentTransaction(int transactionId, double amount, String billType)
    {
        super(transactionId,amount);
        this.billType = billType;
    }
     public String getBillType(){
        return billType;
    }
}