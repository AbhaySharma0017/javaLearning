class Demo5{
    public static void main(String args[]){
        System.out.println("Main is start");
        try{
            String s1 = args[0];
            System.out.println("one number is entered.");

            String s2 = args[1];
            System.out.println("second number is entered.");

            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);

            System.out.println("A: "+a);
            System.out.println("B:"+b);

            int x = a/b;
            System.out.println(x);
        }

        // catch(Exception e){
        //     e.printStackTrace();
        // Exception1: exception ArrayIndexOutOfBoundsException has already been caught.
        //  Exception2: exception NumberFormatException has already been caught
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Provide values");
        }
        catch(NumberFormatException | ArithmeticException e){
            System.out.println("Can't devide by zero");
        }
         catch(Exception e){
              e.printStackTrace();
         } 
        finally{
            System.out.println("I am from finally");
        }
    }
}