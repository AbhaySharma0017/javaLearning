class A1{
    public static void main(String args[])
    {
        int n1[] = {1,2,3};
        int n2[] = {4,5,6};
        int l1 = n1.length;
        int l2 = n2.length;

        int n3[] = new int[l1+l2];
        for(int i=0; i<l1; i++){
           n3[i] = n1[i];
        }
        for(int j=0; j<l2; j++){
            n3[l1+j] = n2[j];
        }
        for(int i=0; i<n3.length; i++){
            System.out.print(n3[i]+" ");
        }
    }
}