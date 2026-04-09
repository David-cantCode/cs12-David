public class Book {
    
    public String name;
    public int numberInStore;


    //all variables
    public Book(String name, int n){
        this.name = name;
        this.numberInStore = n;

    }

    //just with name as wanted in the diagram
    public Book(String name){
        this.name = name;
    }


    //****************************
    //***********GETTERS*********
    //****************************


    public String getName(){
        return name;
    }


    public int getNumberInStore(){
        return numberInStore;
    }



    //****************************
    //***********SETTERS*********
    //****************************


    public void setNumberInStore(int n){
        this.numberInStore = n;
    }




    //method to add copy to store
    public void addACopy(){
        setNumberInStore(numberInStore + 1);
    }


    //method to remove copy from store
    public void sellACopy(){
         setNumberInStore(numberInStore - 1 );
    }


   public String toString() {
      return name +" number of copies in store: " + numberInStore;
   }

}
