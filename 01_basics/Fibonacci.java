//8) WAP to print Fibonacci series.

import java.util.Scanner;
class Fibonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         
         System.out.print("Please, enter a number: ");
         int n = sc.nextInt();

       int a=0, b=1, c;
       for(int i=1; i<=n; i++)
       {
        System.out.print(a+" ");
        c = a + b;
        b = a;
        a = c;
       }
    }
}