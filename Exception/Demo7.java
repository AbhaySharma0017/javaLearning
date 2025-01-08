// Why we use finally because statement is always run after try and catch

class Demo7{
    public static void main(String args[]){
        System.out.println("Main is start.");
        try{
            String str = null;
            System.out.println(str.length());
        }
        // catch(NullPointerException e){
        //     System.out.println("Please provide the value of String");
        // }
        finally{
            System.out.println("I am from finally");
        }
        System.out.println("This is not execute because we are not handle exception");
    }
}