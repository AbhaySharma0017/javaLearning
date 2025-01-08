// Finally

class Demo4{
    public static void main(String args[]){
        try{
            int x = 10/0;
            System.out.println(x);
        }

     //   System.out.println("Finally is not executed.");

        finally{
            System.out.println("finally block is always execute whether exception handle or not.");
            System.out.println("We can write here more than one statement.");
        }
    }
}