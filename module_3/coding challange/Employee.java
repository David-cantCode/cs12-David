//Bank account class David Roman march 17th 2026

/*
    pseudocode



class Employee


    var salary 
    var name
    var num


    func constructorDefault(salary, name, num)
        self.salary = salary
        self.name = name
        self.num = num




    func getter
        return self.variable

    
    func setter(new_var)
        self.variable = new_var 

*/



public class Employee {

    //variables
    private String name;
    private int employee_id;
    private double salary;




    //constructor 
    public Employee(String name,  int employee_id, double salary) {
        this.name = name;
        this.employee_id = employee_id;
        this.salary = salary;
    }


    //****************************
    //*****GETTERS AND SETTERs*****
    //****************************

    
    //name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



    //employee_id
    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int employee_id) {
        this.employee_id = employee_id;
    }

    
    //salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }





    //tostring method 
    @Override
    public String toString() {
        //newlines for readability, plus it looks kinda cool too.
        return "\n Sir " + name + "\n Employee #" + employee_id + "\n salary: $" + salary + "/week \n" ; 
    }








}