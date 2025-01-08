import java.io.*;
class Demo6{
    public static void main(String args[]){
        System.out.println("Main start");
        try{
            PrintWriter pr = new PrintWriter("abc.txt");
            pr.write("Hello guys");
        }
        catch(FileNotFoundException e){
            System.out.println("File not created.");
        }
        finally{
            System.out.println("I am from finally.");
        }
    }
}