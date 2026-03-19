

/*
pseudocode


 
    //make new car with all variables
    car1 = new Car(make, model, year, mileage)

    print "car 1:"
    print car1
     

    //create car without mileage
    car2 = new Car(make2, model2, year2)

    print "car 2 (no mileage):"
    print car2
     

    //setter test
    call car2.setters(new_make, new_model, new_year, new_mileage)
    print "car 2 after setters:"
    print car2
    


    //getter test
    print car1.getters


    ret 0 


*/









public class CarTest {
    public static void main(String[] args) {
        
        //test constructor with all variables
        Car car1 = new Car("Toyota", "Supra", 1998, 676767);
        System.out.println("car 1:");
        System.out.println(car1);
        System.out.println();


        //test constructor without mileage
        Car car2 = new Car("Lexus", "Ls400", 2000);
        System.out.println("car 2 (no mileage):");
        System.out.println(car2);
        System.out.println();



        //setter test
        car2.setMileage(41);
        car2.setMake("Nissan");
        car2.setModel("GTR R34");
        car2.setYear(2005);

        System.out.println("car 2 after setters:");
        System.out.println(car2);
        System.out.println();



        //getter test
        System.out.println("car 1 getters:");
        System.out.println("make: " + car1.getMake());
        System.out.println("model: " + car1.getModel());
        System.out.println("year: " + car1.getYear());
        System.out.println("mileage: " + car1.getMileage());
    }
}