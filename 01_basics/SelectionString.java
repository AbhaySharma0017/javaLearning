class SelectionString{
    public static void main(String args[]){
        String arr[] = {"abbu","vikas","Za","goutam","Abhay"};
        int min;
        String temp = "";
        for(int i=0; i<arr.length; i++)
        {
            min = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[min].compareTo(arr[j]) > 0)
                {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}