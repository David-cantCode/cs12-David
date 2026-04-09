public class Person {
    
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender){
        this.name = name; 
        this.age = age;
        this.gender = gender;
    }


    
    //****************************
    //***********GETTERS*********
    //****************************


    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }



    
    //****************************
    //***********SETTERS*********
    //****************************



    public void setName(String s){
        this.name = s;
    }

    public void setAge(int n){
        this.age = n;
    }

    public void setGender(String s){
        this.gender = s;
    }



    public String toString(){
        return name + ", Age: " + age + " Gender: " +gender + " ";
    }



}
