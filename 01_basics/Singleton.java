class Singleton{
    private Singleton(){
        System.out.print("Hello");
    }
    public static void main(String args[]){
        new Singleton();
    }
}