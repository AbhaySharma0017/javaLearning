//6) WAP to find out the factors of a number.

import java.util.Scanner;
class Factor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                System.out.print(i+" ");
            }
        }
    }
}