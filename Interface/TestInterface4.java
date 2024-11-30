class TestInterface4{
    public static void main(String args[])
    {
        Bank b = new Union4();
        System.out.println("Rate of intrest is: "+b.rateOfIntrest()+"%");
        b = new SBI4();
        System.out.println("Rate of intrest is: "+b.rateOfIntrest()+"%");
    }
}