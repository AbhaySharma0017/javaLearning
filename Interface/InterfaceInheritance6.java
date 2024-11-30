interface Hello{
    void show();
}

interface Yello extends Hello{
    void display();
}

class Test implements Yello{
    public void show(){
        System.out.println("Hello from Hello ");
    }
    public void display(){
            System.out.println("Hello from Yello");
        }
    }
class InterfaceInheritance6{
    public static void main(String args[])
    {
        Test t = new Test();
        t.show();
        t.display();
    }
}