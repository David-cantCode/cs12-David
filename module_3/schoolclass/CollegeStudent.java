class CollegeStudent extends Person {


    private int year;
    private String major;

    public CollegeStudent(String name, int age, String gender, String major, int year){
        super(name, age, gender);
        
        this.major = major;
        this.year = year;
    }

    //****************************
    //***********GETTERS*********
    //****************************

    public int getYear(){
        return year;
    }
    
    public String getMajor(){
        return major;
    }


    //****************************
    //***********SETTERS*********
    //****************************


    public void setYear(int n){
        this.year = n;
    }

    public void setSMajor(String s){
        this.major = s;
    }


    public String toString(){
        return super.toString() + "Year " + year + " Major: " + major;
    }


}
