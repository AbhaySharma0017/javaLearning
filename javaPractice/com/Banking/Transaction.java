class Transaction{
    private int transactionId;
    private long amount;

   public Transaction(int transactionId, long amount)
    {
        this.transactionId = transactionId;
        this.amount = amount;
    }
    int getTransactionId(){
        return transactionId;
    } 
    long getAmount()
    {
        return amount;
    }
}