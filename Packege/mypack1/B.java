package mypack1;
import pack.*;

 public class B{
    private int a;
    private int b;

    public B(int a, int b){
        this.a = a;
        this.b = b;
     }
  
    public void add(){
        System.out.println("Addition of two number is: "+(a+b));
    }
    public static void main(String args[])
    {
        A a = new A();
        a.msg();
    }
}
