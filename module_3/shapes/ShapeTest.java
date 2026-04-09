public class ShapeTest{

    

    
    public static void main(String[] args) {
        
    //note again: only the setters and getters of the sub classes were used
    //this is because we only need to test the base class once (which we do)

    //shape test
    Shape p1 = new Shape("red", true);
    System.out.println("Shape: ");
    System.out.println(p1);
    System.out.println();

    //shape setters
    p1.setColor("purple"); 
    p1.setFilled(false);
    
    //shape getters 
    System.out.println("shape getters (after setters): ");
    System.out.println("Color; " + p1.getColor());
    System.out.println("Filled: " + p1.isFilled());
 

    
    //circle test
    
    Circle p2 = new Circle("orange", true, 5 );
    System.out.println("\n Circle: ");
    System.out.println(p2);
    System.out.println();

    //circle setters
    p2.setRadius(2);
    
    //circle getters
    System.out.println("Circle getters: (after setters):");
    System.out.println("Radius: " + p2.getRadius());
    System.out.println("Perimeter: " + p2.getPerimeter());
    System.out.println("Area: " + p2.getArea());   


    
    //rectangle test
    Rectangle p3 = new Rectangle("black", false, 1, 3);
    System.out.println("\n Rectangle:");
    System.out.println(p3);
    System.out.println();


    //rectangle setters
    p3.setWidth(6);
    p3.setLength(7);


    //rectangle getters:
    System.out.println("Rectangle getters: (after setters):");
    System.out.println("Width: " + p3.getWidth());
    System.out.println("Length: " + p3.getLength());
    System.out.println("Perimeter: " + p3.getPerimeter());
    System.out.println("Area: " + p3.getArea());   




    //square test
    Square p4 = new Square("hot pink", true, 1 );
    System.out.println("\n Square:");
    System.out.println(p4);
    System.out.println();


    //square setters
    p4.setSide(6);


    //square getters:
    System.out.println("Square getters: (after setters):");
    System.out.println("Sides: " + p4.getSide());
    System.out.println("Perimeter: " + p4.getPerimeter());
    System.out.println("Area: " + p4.getArea());   




  
    




    
    



    }
    
}