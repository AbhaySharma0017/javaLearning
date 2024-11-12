//9) WAP to print N even numbers.
import java.util.Scanner;
class Even{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(2*i+" ");
        }
    }
}