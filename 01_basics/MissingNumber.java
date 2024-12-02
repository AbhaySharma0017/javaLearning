class MissingNumber{
    public static void main(String args[])
    {
        int arr[] = {8, 2, 4, 5, 3, 7, 1};
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
        }
        int k = 1;
        for(int i=0; i<arr.length; i++)
        {
            if(k == arr[i])
            {
                k++;
            }
            else{
                System.out.println("Missing number is : "+k);
                break;
            }
        }
    }
}