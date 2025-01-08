class Demo2{
    public static void main(String args[])
    {
        try{
            System.out.println("Hello");
            String s1 = args[0];
            System.out.println("Good morning");

            String s2 = args[1];
            System.out.println("Baby...");

            System.out.println(s1);
            System.out.println(s2);
        }

       // System.out.println("try' without 'catch.");
       
        catch(Exception e){
         System.out.println("Error");
        }
         System.out.println("Procees...");
    }
}