// Abstract Class Having Constructor, Data Member and Methods
// An abstract class can have a data member, abstract method, method body (non-abstract method), constructor, and even main() method.

abstract class Bike{
    Bike(){
        System.out.println("Bike constructor is created.");
    }
    abstract void run();
    void move(){
        System.out.println("Bike is started.");
    }
}

class jawa extends Bike{
        void run(){
            System.out.println("Bike is running mode.");
        }

        // void move(){
        //     System.out.println("Bike is stop");
        // } (We are also override concreate method);
}

class AbsConstructor5{
    public static void main(String args[])
    {
        Bike b = new jawa();
        b.run();
        b.move();
    }
}