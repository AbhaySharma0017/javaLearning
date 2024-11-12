class Constuctor{
    Constuctor(double d){
        this(10);
        System.out.print("Double");
    }
    Constuctor(int i){
        this();
        System.out.print("int");
    }
    Constuctor(){
        System.out.print("no");
    }
    public static void main(String args[]){
        Constuctor t1=new Constuctor(10.5);
Constuctor t2=new Constuctor(10);
        Constuctor t3=new Constuctor();
    }
}