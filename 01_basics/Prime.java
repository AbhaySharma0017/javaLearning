//7) WAP to check whether entered number is prime or not.
 import java.util.Scanner;
 class Prime{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number which you want to check : ");
    int num = sc.nextInt();
    boolean f = true;
    for(int i=2; i<(num/2); i++){
        if(num % i == 0)
        {
            f = false;
            break;
        }
    }
    if(f){
        System.out.print(num+" Number is prime.");
    }
    else{
         System.out.print(num+" Number is not prime.");
    }
  }
 }