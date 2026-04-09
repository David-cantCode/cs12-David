class Square extends Rectangle {

   
    private double side;

    public Square(String color, boolean filled, double side){
        
        super(color, filled, side, side); 
        
        this.side = side;
    }



    public void setSide(double n){
        this.side = n;

        super.setLength(n);
        super.setWidth(n);
    }






    public double getSide(){
        return side;
    }

 




    public String toString(){
        return "A Square of sides: " + side + " which is a subclass of " + super.toString();
    }


}
