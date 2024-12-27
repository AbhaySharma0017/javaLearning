import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int size = sc.nextInt();

    Shape shape[] = new Shape[size];
    for(int i=0; i<shape.lenght; i++)
    {
        System.out.println("Enter radius of circle: ");
        int rad = sc.nextInt();
        shape[i] = new Circle(rad);

        System.out.println("Enter Length  of rectangle: ");
        int lenght = sc.nextInt();
         
        System.out.println("Enter Width  of rectangle: ");
        int width = sc.nextInt();

        shape[i] = new Rectangle(lenght,width);    
    }
     for(int i=0; i<shape.lenght; i++)
     {
        System.out.print();
     }
  }
}