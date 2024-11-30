interface Drawable{
    void show();
    default void msg(){
        System.out.println("Hello my insta family");
    }
}
class Test implements Drawable{
    public void show(){
        System.out.println("Hello my LinkedIn family");
    }
}
class DefaultMethod7{
    public static void main(String args[])
    {
        Test t = new Test();
        t.show();
        t.msg();
    }
}