
 interface Animal{
     void eat();
    void sleep();
   // void information(); // Is method ko override karna necessary hai 

    public static final int MAX_AGE = 100;

   // Static method
     public static void info(){ // Is method ko override karna necessary nhi hai
        System.out.println("This is an Animal interface");
    }
  // Default method
     public default void run(){
    this.eat();
     System.out.println("This is running");
 }

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
       Animal.info();
       d.run();
       System.out.println("Age "+new Cat().MAX_AGE);
       System.out.println("Age "+Animal.MAX_AGE);
    }
}