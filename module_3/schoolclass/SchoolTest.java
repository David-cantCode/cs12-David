public class SchoolTest{

    

    
    public static void main(String[] args) {
        
    //note: only the setters and getters of the sub classes were used
    //this is because we only need to test the base class once (which we do)

    //person test
    Person p1 = new Person("Dave Mustaine", 64, "M");
    System.out.println("Person:");
    System.out.println(p1);
    System.out.println();

    //person setters
    p1.setName("James Head Field"); 
    p1.setAge(62);
    p1.setGender("F");
    
    //person getters 
    System.out.println("Person getters (after setters): ");
    System.out.println("Name; " + p1.getName());
    System.out.println("Age: " + p1.getAge());
    System.out.println("Gender: " + p1.getGender());




    
    //student test
    
    Student p2 = new Student("Addison", 16, "F", "67", 4.21);
    System.out.println("\n Student: ");
    System.out.println(p2);
    System.out.println();

    //student setters
    p2.setGpa(0.01);
    p2.setId("41");
    
    //student getters
      System.out.println("Student getters: (after setters):");
    System.out.println("GPA: " + p2.getGpa());
    System.out.println("ID: " + p2.getId());   


    
    //college student test
    CollegeStudent p3 = new CollegeStudent("David Roman", 17, "M", "Mechanical Engineering", 1);
    System.out.println("\n College Student:");
    System.out.println(p3);
    System.out.println();


    //colege student setters
    p3.setSMajor("Plumbing");
    p3.setYear(3);


    //collage student getters:
    System.out.println("Collage getters: (after setters):");
    System.out.println("Major: " + p3.getMajor());
    System.out.println("Year: " + p3.getYear());   




    //teacher test
    Teacher p4 = new Teacher( "Miss Alchorn", 29, "F", "English", 9000000);
    System.out.println("\n Teacher: ");
    System.out.println(p4);
    System.out.println();


    //teacher setters
    p4.setSubject("Math");
    p4.setSalary(20);

    //teacher getters
    System.out.println("Teacher getters: (after setters):");
    System.out.println("Major: " + p4.getSubject());
    System.out.println("Salary: $" + p4.getSalary());   

    




    
    



    }
    
}