//3) WAP to find out the sum of N natural number.

import java.util.Scanner;
class SumNatural{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
         for(int i=1; i<=n; i++){
            sum+=i;
         }
         System.out.println("Sum of N natural number = "+sum);
    }
}