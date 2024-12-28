//Find largest element from Array.

// There are many way to solve this problem like (1) sort it in assending order and print last element. but in this way thime complexcity is     O(n log n) high
// 2) using below approach
import java.util.Scanner;
class LargestElement{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter "+(i+1)+" element of array: ");
            arr[i] = sc.nextInt();
        }

            int large = arr[0];
            for(int i=1; i<arr.length; i++)
            {
               if(large < arr[i])
               {
                    large = arr[i];
               }
            }
            System.out.println("Largest element in array is: "+ large);
    }
}

// The time complexity of this program is "O(n)"; 