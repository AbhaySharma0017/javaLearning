class SecondLargest{
    public static void main(String args[])
    {
        int arr[] = {6,8,2,3,4,1,5,7};
        int temp;

        for(int i=0; i<arr.length; i++)
        {
            int flag = 0;
            for(int j=0; j<arr.length-1-i; j++)
            {
                if(arr[j] < arr[j+1])
                {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag++;
                }
            }
            if(flag == 0)
            {
                break;
            }
        }
        System.out.print(arr[1]);
        
    }
}