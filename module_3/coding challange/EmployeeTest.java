/*
    pseudocode


    //make new employee 
    employee1 = new Employee(name, id, salary)

    print "employee 1"
    print employee1
     

    //create second employee (before setters)
    employee2 = new Employee(name2, id2, salary2)

    print "employee 2, pre setters"
    print employee2
     

    //setter test
    call employee2.setters(new_name, new_id, new_salary)

    print "Employee 2 after setters:"
    print employee2
    


    //getter test
    print employee1.getters


    ret 0 

*/





public class EmployeeTest {
    public static void main(String[] args) {
        
        //test constructor with all variables
        Employee Employee1 = new Employee("David Roman", 67, 20);
        System.out.println("employee 1");
        System.out.println(Employee1);
        System.out.println();


        

        //setter test
        Employee employee2 = new Employee("James Head Field", 21, 290);
        System.out.println("employee 2, pre setters");
        System.out.println(employee2);
        System.out.println();
     
        //set variables
        employee2.setEmployeeId(41);
        employee2.setName("Dave Mustaine");
        employee2.setSalary(4000);

        //out
        System.out.println("Employee 2 after setters:");
        System.out.println(employee2);
        System.out.println();



        //getter test
        System.out.println("Employee 1 getters:");
        System.out.println("name: " + Employee1.getName());
        System.out.println("salary: " + Employee1.getSalary());
        System.out.println("EmployeeId: " + Employee1.getEmployeeId());
    }
}