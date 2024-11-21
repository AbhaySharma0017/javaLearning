class SecondLargest{
    public static void main(String args[])
    {
        int arr[] = {6,8,2,4,3,1,5,7};
        int temp;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length-1; j++)
            {
                if(arr[i] < arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if(i == 2)
            {
               break;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("Second largest element is : "+ arr[3]);
    }
}