import java.util.Scanner;
class Bob{

    float radius(int num){
        return(2*3.14f*num);
    }
    double radius(double number)
    {
        return(3.14*number*number);
    }
    public static void main(String args[])
    {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the radius of circumference as a integer: ");
           int rad1 = sc.nextInt();
          
           System.out.println("Enter the radius of circle in double: ");
           double rad2 = sc.nextDouble();
           
           Bob b1 = new Bob();
           System.out.println(b1.radius(rad1));
           System.out.print(b1.radius(rad2)); 

    }
}