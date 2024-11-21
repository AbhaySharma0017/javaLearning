import java.util.Scanner;
class MinArray{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter how many element you want to put in array: ");
       int n = sc.nextInt();

       int arr[] = new int[n];
       for(int i=0; i<n; i++){
        System.out.print("Enter "+(i+1)+" element of array: ");
        arr[i] = sc.nextInt();
       }
     
     int min = arr[0];
     for(int i=1; i<arr.length; i++)
     {
        if(arr[i] < min)
        {
            min = arr[i];
        }
     }
     System.out.print("Minimum element in array : "+min);


    }
}