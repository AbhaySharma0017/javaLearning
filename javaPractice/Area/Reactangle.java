class Rectangle extends Shape{
    public Rectangle(int lenght, int width){
        this.lenght = lenght;
        this.width = width;
    }

    public void calculateArea(int lenght, int width)
    {
        System.out.print("Area of rectangle: "+lenght*width);
    }
}