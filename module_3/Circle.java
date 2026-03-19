public class Circle {
    private double radius;
    private final double PI = 3.14;
    
    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Method to calculate area
    public double getArea() { //changed void -> double so we can return a double
        //orignally this function had a paramater, 
        // why would we need a paramemter if every object has their own getArea function? we can simply just return the radius * pi
        return this.radius * PI; 
    }
    
    // Method to calculate circumference
    public double getCircumference() {
        return 2 * PI * this.radius; //changed to this.radius so we can just use the objects radius instead of passing paramaters
    }
	
	//Method to set radius
	public void setRadius(double radius){ //changed function type to void because this function returns nothing.
                                            //along with adding the paramater radius, which allows us to updates the objects radius via a function
		this.radius = radius;
	}
}
