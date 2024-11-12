//12) WAP to print Odd numbers upto N.
import java.util.Scanner;
class OddUptoN{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int even =1;
         for(int i=1; i<=n; i++){
            System.out.print(even+" ");
            even+=2;
         }
    }
}