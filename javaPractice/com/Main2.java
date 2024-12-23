import java.util.Scanner;
class Main2{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of object: ");
        int size = Integer.parseInt(sc.nextInt());
        PeerToPeerTransaction p1[] = new PeerToPeerTransaction[size];

        for(int i=0; i<p1.length; i++)
        {
            System.out.println("Enter transaction ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("Enter amount : ");
            long amount = Long.parseLong(sc.nextLine());

            System.out.println("Enter recipient name : ");
            String recipientName  = sc.nextLine();

            p1[i] = new PeerToPeerTransaction(id,amount,recipientName);
        }


    }
}