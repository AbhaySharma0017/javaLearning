  // We can not create object of abstract class.


  public abstract class AbsObject1{
  
  // Abstract method
  abstract void shape();

  // Concrete method
  void show(){
    System.out.print("This is normal method");
  }

  public static void main(String args[])
  {
    int a = 10+90;
    System.out.print(a);

    AbsObject1 obj = new AbsObject1();
    obj.show();
  }
}