//Example of Abstract Class that has an Abstract Method
//In this example, Bike is an abstract class that contains only one abstract method run. Its implementation is provided by the Honda class.



 abstract class AbsMethod{
   abstract void run();
}

public class Honda extends AbsMethod{
     void run(){
        System.out.print("Implement abstract method.");
     }

     public static void main(String args[])
     {
        AbsMethod obj = new Honda();
        obj.run();
     }
}