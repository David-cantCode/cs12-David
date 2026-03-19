
//cars class David Roman march 15th 2026

/*
    pseudocode



class car

    var make
    var model 
    var year
    var mileage


    func constructorDefault( year, make, model, mileage)
        self.year = year
        self.make = make
        self.model = model
        self.mileage = mileage




    func constructorNoMileage(year, make, model)
        self.year = year
        self.make = make
        self.model = model
        self.mileage = 0


    func getter
        return self.variable  

    
    func setter(new_var)
        self.variable = new_var 

*/


public class Car {

    //variables
    private String make;
    private String model;
    private int year;
    private double mileage;




    //constructor with all variables
    public Car(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    //second construtor without mileage
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = 0;
    }



    //****************************
    //*****GETTERS AND SETTERs*****
    //****************************

    
    //make
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

  

    //model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



    //year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
    //mileage3
    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }





    //tostring method 
    @Override
    public String toString() {
        return  make + " " + model + ", year: " + year + ", miles: " + mileage ; 
    }








}