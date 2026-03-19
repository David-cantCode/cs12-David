public class Rectangle {
    private int length;
    private int width;
    
    // Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    // Method to calculate area
    public int getArea() { //changed to public so we can access outside of the class
        return length * width;
    }
    
    // Method to calculate perimeter
    public int getPerimeter() {
        return 2 * (length + width);
    }
}
