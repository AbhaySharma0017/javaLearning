class MissingNumber{
    public static void main(String args[])
    {
        int arr[] = {2,1,7,5,4,8,3};
        int sum1 = arr[0];
        int max = arr[0];
        int temp;
        for(int i=1; i<arr.length; i++)
        {
            if(max < arr[i])
            {
                temp = max;
                max = arr[i];
                arr[i] = temp;
               
            }
             sum1+=arr[i];
        }
        System.out.println(sum1);
        int sum2 = 0;
        for(int i=1; i <= max; i++)
        {
            sum2+=i;
        }
        System.out.println("Missing number is: "+ (sum2-sum1));
    }
}