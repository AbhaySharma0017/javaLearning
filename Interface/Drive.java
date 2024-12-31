 interface PaymentGateWay{
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentGateWay{
   public void processPayment(double amount){
    System.out.println("Card Amount: "+amount);
   }
}

class UPIPayment implements PaymentGateWay{
    public void processPayment(double amount){
        System.out.println("UPI Amount: "+amount);
    }
}

class Drive{
    public static void main(String args[])
    {
        CreditCardPayment c1 = new CreditCardPayment();
        c1.processPayment(3.44);
        UPIPayment u1 = new UPIPayment();
        u1.processPayment(5.55);
    }
}