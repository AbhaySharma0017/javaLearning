//In this example, if we create the instance of Rectangle class, draw() method of Rectangle class will be invoked.

abstract class Shape{
    abstract void draw();
}

 class Rectangle extends Shape{
      void draw(){
        System.out.println("Rectangle");
      }
  
}

class Circle extends Shape{
    void draw(){
        System.out.println("Circle");
    }
     
}

class TestAbstraction1{
    public static void main(String args[])
    {
       Shape s1 = new Rectangle();
       s1.draw();
       
    }
}
