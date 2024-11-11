//2) WAP to print N natural number.  
import java.util.Scanner;
class Natural{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       System.out.println("Please, enter a number: ");
       int n = sc.nextInt();
       for(int i=1; i<=n; i++){
        System.out.print(i+" ");
       }
    }
}