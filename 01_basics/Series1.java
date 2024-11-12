//16) …... -6	-3	0	3	6	9	……. n terms	

import java.util.Scanner;
class Series1{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    int num = 0;
    for(int i =1; i<=n; i++){
        System.out.print(num+" ");
        num+=3;
    }
    }
}