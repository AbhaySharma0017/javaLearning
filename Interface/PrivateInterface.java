interface i2{
   private void do(){
        System.out.println("Do some work");
    }
    default void done(){
        do();
    }
}
public class PriavteInterface implements i2{
    public static void main(String args[]){
       i2 obj = new PriavteInterface();
       obj.done();
    }
}