class Area{
    private int l;
    private int w;

    public void setData(int l, int w){
       this.l = l;
       this.w = w;
    }

    public int getArea(){
        return l*w;
    }

    public static void main(String args[])
    {
        Area a = new Area();
       // p.setData(10,20);
       a.l = 10;
       a.w = 20;
        int area = a.getArea();
        System.out.print("Area is: "+ area);
    }
}