 class Demo9{
    public static void main(String args[]){
        System.out.println("Main is start.");
        try{
            String str = null;
            System.out.println(str.length());
            System.out.println("Let's check");
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally{
            System.out.println("I am from finally");
        }
    }
}