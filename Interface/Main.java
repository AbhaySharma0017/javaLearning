interface RBI{
    void ROI();
    void KYC();
    default void addressRealated(){
        System.out.println("Take default address");
    }
}
class SBI implements RBI{
    public void ROI(){
        System.out.println("This is from SBI class");
    }
    public void KYC(){
        System.out.println("This is from also SBI class");
    }

}
class Main{
    public static void main(String args[])
    {
        RBI obj = new SBI();
        obj.ROI();
        obj.KYC();
        obj.addressRealated();
    }
}