class Pro1{
    private int l;
    private int w;

    public void setData(int a, int b){
        l = a;
        w = b;
    }

    public int getArea(){
        return l*w;
    }

    public static void main(String args[])
    {
        Pro1 p = new Pro1();
       // p.setData(10,20);
       p.l = 10;
       p.w = 20;
        int area = p.getArea();
        System.out.print("Area is: "+ area);
    }
}