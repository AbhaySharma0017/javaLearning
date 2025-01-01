interface IN{
    int a ;
    void display();
    public static void main(String args[])
    {
        System.out.println("Abhya");
    }
}
class A implements IN{
    public static void main(String args[])
    {
     A a1 = new A();
     System.out.println(a1.a);
    }
}