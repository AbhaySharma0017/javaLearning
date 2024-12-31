import java.util.Scanner;

interface Shape{
    void calculateArea();
}

class Circle implements Shape{
    private double rad;
    public Circle(double rad){
        this.rad = rad;
    }
   public void calculateArea(){
    System.out.println("Area of circle: "+(3.14*rad*rad));
   }
}

class Rectangle implements Shape{
    private int length;
    private int width;

     public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
     }

public void calculateArea(){
    System.out.println("Area of rectangle: "+(length*width));
}
}

class Drive1{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter radius of circle: ");
      double rad = sc.nextDouble();

      System.out.println("Enter length and width of recatngle: ");
      int length = sc.nextInt();
      int width = sc.nextInt();

      Circle c1 = new Circle(rad);
      Rectangle r1 = new Rectangle(length, width);

      r1.calculateArea();
      c1.calculateArea();
       
    }
}