// return in exception
// return karwane ke pahle finally ke pass toh jata he hai.

class A{
    int test(){
        try{
            String str = null;
            System.out.println(str.length());
            return 15;
        }
        // catch(NullPointerException e){
        //     return 30;
        // }
        // // finally{
        // //     return 60;
        // // }
        catch(Exception e){
           // return 45;
        }
        return 90;
    }
}

class Demo8{
    public  static void main(String args[]){
       A obj = new A();
       System.out.println(obj.test());
       System.out.println("Neccesary code.");
    }
}