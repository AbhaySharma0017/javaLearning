 abstract class Bank{
   abstract int getRateOfIntrest();
}

class SBI extends Bank{
    int getRateOfIntrest(){
        return 5;
    }
}

class Union extends Bank{
    int getRateOfIntrest(){
        return 7;
    }
}
//  class TestBank{
//     public static void main(String args[]);
//     Bank b;
//     b = new SBI();
//     System.out.print("Intrest is "+b.getRateOfIntrest());
//  }
 
class TestBank{    
public static void main(String args[]){    
Bank b;  
b=new SBI();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");       
}}    