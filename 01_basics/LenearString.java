import java.util.Scanner;
class LenearString{
  public static void main(String args[])
{
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a name which you want to search: ");
       String name = sc.next();

       String arr[] = {"abhay","sachin","vikas","anikesh"};
       int temp = 0;

       for(int i=0; i<arr.length; i++)
       {
        if(arr[i].equals(name.toLowerCase()))
        {
            System.out.print(name+ " Name is found.");
            temp++;
        }
       }
       if(temp == 0)
       {
        System.out.print(name+" not present");
       }
}
}