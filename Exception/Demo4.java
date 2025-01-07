class A{
    void test1() throws FileNotFoundException{
        test2();
    }
    void test2() throws FileNotFoundException{
        test3();
    }
    void test3() throws FileNotFoundException{
        int x = 10/0;
    }
}
class Demo4{
    public static void main(String args[]){
       A obj = new A();
       obj.test1();
    }
}