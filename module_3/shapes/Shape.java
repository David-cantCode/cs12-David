public class Shape {
    
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled){
        this.color = color; 
        this.filled = filled;
    }


    
    //****************************
    //***********GETTERS*********
    //****************************



    public String getColor(){
        return color;
    }

    public boolean isFilled(){
        return filled;
    }
 


    
    //****************************
    //***********SETTERS*********
    //****************************



    public void setColor(String s){
        this.color = s;
    }

    public void setFilled(boolean b){
        this.filled = b;
    }
   



    public String toString(){
        //i could just use the variable 'filled' but this sounds better
        if (isFilled()){ return " A shape of color " + color + " that is filled";}
        
        
        return " A shape of color " + color + " that is not filled";
    }



}
