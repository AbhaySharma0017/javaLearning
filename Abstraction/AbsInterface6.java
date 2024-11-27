// Another Real Scenario of Abstract Class
// The abstract class can also be used to provide some implementation of the interface. In such case, the end user may not be forced to override all the methods of the interface.

interface I{
    void a1();
    void b1();
    void c1();
    void d1(); 
}

abstract class M implements I{
    public void a1(){
        System.out.println("a1 method");
    }
}

class N extends M{
      public void b1(){
         System.out.println("b1 method");
      }

     public void c1(){
        System.out.println("c1 method");
      }
     public void d1(){
        System.out.println("d1 method");
      }
}

class AbsInterface6{
    public static void main(String args[])
    {
        I i = new N();
        i.a1();
        i.b1();
        i.c1();
        i.d1();
    }
}