class SecondLargest1{
    public static void main(String args[])
    {
        int arr[] = {7,7,7,7,7,7};
        int temp;
        boolean f = true;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = arr.length-2; i>=0; i--)
        {
            if(arr[i] != arr[arr.length-1])
            {
                f = false;
                System.out.println("Second largest element is "+arr[arr.length-i]);
                break;
            }
        }
        if(f)
        {
            System.out.println("Second largest is not present.");
        }
        
    }
}