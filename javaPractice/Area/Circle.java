class Circle extends Shape{
    public Circle(float rad){
       this.rad = rad;
    }
    public void calculateArea(float rad){
      System.out.println("Area of circle: "+ 3.14f*rad*rad);
   }
}