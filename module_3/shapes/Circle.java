class Circle extends Shape {

    //used chatgpt to find out how to make a constant in java, other then that its all from me :)
    //weird how its refered to as 'final' why couldnt it just be 'const' or better yet '#define' 
    final private double PI = 3.14; 
    private double radius;

    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        
        this.radius = radius;
     
    }



    public void setRadius(double n){
        this.radius = n;
    }





    public double getRadius(){
        return radius;
    }

    public double getPerimeter(){
        return 2 * PI * radius; 
    }

    public double getArea(){
        return PI * radius * radius ;
    }






    public String toString(){
        return "A circle of a radius " + radius + " which is a subclass of " + super.toString();
    }


}
