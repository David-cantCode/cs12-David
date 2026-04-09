class Rectangle extends Shape {

   
    private double length;
    private double width;

    public Rectangle(String color, boolean filled, double length, double width){
        super(color, filled);
        
        this.length = length;
        this.width = width;
     
    }



    public void setLength(double n){
        this.length = n;
    }

    public void setWidth(double n){
        this.width = n;
    }





    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }


    public double getPerimeter(){
        return 2* (width + length); 
    }

    public double getArea(){
        return length * width;
    }






    public String toString(){
        return "A Rectangle of width: " + width + " and length: " + length + " which is a subclass of" + super.toString();
    }


}
