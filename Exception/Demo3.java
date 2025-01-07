class Demo3{
    public static void main(String args[]){
        System.out.println("Main Start...");
        try{
            String s1 = args[0];
            System.out.println("Welcome");
            
            String s2 = args[1];
            System.out.println("Hello guys");
 
            int x = Integer.parseInt(s1);
            int y = Integer.parseInt(s2);
            System.out.println("X: "+x);
            System.out.println("Y: "+y);
            int z = x/y;
            System.out.println(z);
        }
        catch(ArrayIndexOutOfBoundsException r){
           System.out.println("Please provide values.");
        }
        catch(ArithmeticException e){
         // e.printStackTrace();
         System.out.println("Can not divide by zero");
        }
        // catch(Exception e){

        // }
        System.out.println("Proceesed...");
    }
}