class Student extends Person {


    private String id;
    private double gpa;

    public Student(String name, int age, String gender, String id, double gpa){
        super(name, age, gender);
        
        this.gpa = gpa;
        this.id = id;
    }



    //****************************
    //***********SETTERS*********
    //****************************

    public void setGpa(double n){
        this.gpa = n;
    }


    public void setId(String s){
        this.id = s;
    }


    

    
    //****************************
    //***********GETTERS*********
    //****************************

    public double getGpa(){
        return gpa;
    }

    public String getId(){
        return id;
    }



    public String toString(){
        return super.toString() + "ID: " + id + " GPA: " + gpa;
    }


}
