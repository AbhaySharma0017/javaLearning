class Volume extends Area{
    private int h;

    public void setData(int l, int w, int h){
          setData(l,w);
          this.h = h;
    }
    public int getVolue(){
        return this.getArea()*h;
    }
    public static void main(String args[])
    {
        Volume v = new Volume();
        v.setData(2,4,5);
        int vol = v.getVolue();
        System.out.print("Volume is : "+vol);
    }
}