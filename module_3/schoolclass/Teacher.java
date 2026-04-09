class Teacher extends Person {


    private int salary;
    private String subject;

    public Teacher(String name, int age, String gender, String subject, int salary){
        super(name, age, gender);
        
        this.subject = subject;
        this.salary = salary;
    }

    //****************************
    //***********GETTERS*********
    //****************************

    public int getSalary(){
        return salary;
    }

    public String getSubject(){
        return subject;
    }


    //****************************
    //***********SETTERS*********
    //****************************


    public void setSalary(int n){
        this.salary = n;
    }

    public void setSubject(String s){
        this.subject = s;   
    }


    public String toString(){
        return super.toString() + "Salary $" + salary + " Subject " + subject;
    }


}
