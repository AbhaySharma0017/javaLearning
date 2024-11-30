interface Printable{
    void display();
}
interface Showable{
    void display();
}
class Test implements Printable, Showable{
     public void display(){
        System.out.println("Display from printable interface.");
     }

    //  public void display(){
    //     System.out.println("Display from showable interface.");
    //  }
    //  Problem: You are implementing two interfaces (Printable and Showable), both of which declare a method named display(). In the class Test, you are attempting to define the method display() twice, which leads to a method conflict because Java does not allow multiple methods with the same name and signature in the same class.
}

class MultipleInheriTance5{
    public static void main(String args[])
    {
       Test t1 = new Test();
       t1.display();
    }
}