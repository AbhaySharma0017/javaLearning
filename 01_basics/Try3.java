class Try3{
    public static void main(String args[])
    {
        String str = "arbhdfEA";
        str = str.toLowerCase();
        int v=0, c=0;
        char ch;
        for(int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            if(ch =='a' || ch =='e'|| ch == 'i' || ch =='o'|| ch=='u'){
                v++;
            }
            else if(ch == 32){
                continue;
            }
            else{
                c++;
            }
        }
        System.out.println(v);
        System.out.print(c);
    }
}