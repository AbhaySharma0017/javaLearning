interface Drawable{
    void draw();
    static int cube(int r){
        return r*r*r;
    }
}

class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing rectangle");
    }
}

class StaticMethod{
    public static void main(String args[])
    {
        Rectangle r  = new Rectangle();
        r.draw();
        System.out.println(Drawable.cube(3));
    }
}