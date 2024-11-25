import java.util.Scanner;
class KthElement{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a kth number: ");
        int k = sc.nextInt();

        int arr[] = {5,8,12,7,6,2,4};
        int temp;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if(i == k)
            {
                break;
            }
        }
        System.out.print("Kth Smallest number is: "+arr[k-1]);
    }
}