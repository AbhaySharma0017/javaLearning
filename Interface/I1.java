
 interface Animal{
     void eat();
    void sleep();

    public static final int MAX_AGE = 100;
}

class Dog implements Animal{

   public void eat(){
       System.out.println("Dog is eating.");
    }

   public void sleep(){
        System.out.println("Dog is sleeping.");
    }
}

class Cat implements Animal{
  public void eat(){
    System.out.println("Cat is eating.");
   }
  public void sleep(){
    System.out.println("Cat is sleeping.");
   }
}

class I1{
    public static void main(String args[]){
       Dog d = new Dog();
       d.eat();
       d.sleep();

       System.out.println("Age "+new Cat().MAX_AGE);
       System.out.println("Age "+Animal.MAX_AGE);
    }
}