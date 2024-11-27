 abstract class Bank{
   abstract int getRateOfInterest();
}

class SBI extends Bank{
    int getRateOfInterest(){
        return 5;
    }
}

class Union extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}

 class TestBank{
    public static void main(String args[])
    {
    Bank b;
    b = new SBI();
    System.out.println(" Rate of Intrest is "+b.getRateOfInterest()+" %");

    b = new Union();
    System.out.print("Rate of Intest is "+b.getRateOfInterest()+" %");
 }
 }
