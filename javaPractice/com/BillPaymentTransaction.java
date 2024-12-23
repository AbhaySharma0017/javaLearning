class  PeerToPeerTransaction extends Transaction{
    private String billType;

    public PeerToPeerTransaction(int transactionId, long amount, String billType)
    {
        super(transactionId,amount);
        this.billType = billType;
    }
     String getBillType(){
        return billType;
    }
}