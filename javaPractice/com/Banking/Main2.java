package com.Banking;
import java.util.Scanner;
class Main2{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of object: ");
        int size = Integer.parseInt(sc.nextLine());
        PeerToPeerTransaction p1[] = new PeerToPeerTransaction[size];
        // PeerToPeerTransaction p2 = new PeerToPeerTransaction();
        for(int i=0; i<p1.length; i++)
        {
            System.out.println("Enter transaction ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("Enter amount : ");
            double amount = Double.parseDouble(sc.nextLine());

            System.out.println("Enter recipient name : ");
            String recipientName  = sc.nextLine();

            p1[i] = new PeerToPeerTransaction(id,amount,recipientName);
        }
         for(int i=0; i<p1.length; i++)
         {
            System.out.println("Transaction Id: "+p1[i].getTransactionId()+" \n Amount: "+p1[i].getAmount()+" \n Recipient Name: "+p1[i].getRecipient());
         }

         BillPaymentTransaction b1 = new BillPaymentTransaction(2,57000,"Electricity Bill");
         System.out.println("Id: "+b1.getTransactionId()+"\n Amount: "+b1.getAmount()+"\n Bill Type: "+b1.getBillType());

         OnlinePurchaseTransaction o1 = new OnlinePurchaseTransaction(3,50000,"Abhay");
         System.out.println("Id: "+o1.getTransactionId()+"\n Amount: "+b1.getAmount()+"\n Merchant: "+o1.getMerchant());
    }
}