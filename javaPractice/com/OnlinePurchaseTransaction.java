class  OnlinePurchaseTransaction extends Transaction{
    private String recipient;

    public OnlinePurchaseTransaction(int transactionId, long amount, String merchant)
    {
        super(transactionId,amount);
        this.merchant = merchant;
    }
    String getMerchant(){
        return merchant;
    }
}