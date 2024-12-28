// Better solution of finding second largest element without sorting and time complexcity is "O(N + N) = O(2N)".

import java.util.Scanner;
class SecondLargest2{

public static void main(String arga[]){


 Scanner sc = new Scanner(System.in);

 System.out.println("Enter the size of Array: ");
 int size = sc.nextInt();

 int arr[] = new int[size];
 for(int i=0; i<arr.length; i++)
 {
    System.out.print("Enter "+(i+1)+" elemet of array: ");
    arr[i] = sc.nextInt();
 }
  int largest = arr[0];
  for(int i=0; i<arr.length; i++)
  {
    if(largest < arr[i])
    {
       largest = arr[i];
    }
  }
  int sLargest = -1;
  for(int i=0; i<arr.length; i++)
  {
    if(sLargest < arr[i] && arr[i] != largest)
    {
        sLargest = arr[i];
    }
  }
   System.out.println("Second largest element is: "+sLargest);
}
}

