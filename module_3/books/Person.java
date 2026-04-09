public class Person {
    
    private String name;
    private int age;
    private String phoneNumber;

    final int MAXBOOKS = 10;
    private Book[] bookList = new Book[MAXBOOKS];
    private int bookCount = 0;

    


    public Person(String name, int age, String phoneNumber){
        this.name = name; 
        this.age = age;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber(){
        return phoneNumber;
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

    public void setPhoneNumber(String s){
        this.phoneNumber = s;
    }






    //method to add book to list, and remove it from the store
    public void buyBook(Book book){
        if (book.numberInStore <= 0){return;}  //there needs to be a book in the store to buy. duhh

        bookList[bookCount] = book;
        bookCount++;

        book.sellACopy(); //since we are buying a book, we obviosiouly gotta remove a copy from the store



    }


    //method to remove book from list, and add it to store
    public void sellBook(Book book){

        for (int n = 0; n < bookCount; n ++){  //i love how java for loops are just like c. this is the best way to have a for loop in a language :)
            if (bookList[n] == book){
                
                for(int i = n; i < bookCount - 1; i++){
                bookList[i] = bookList[i + 1]; //shift books to the left
            }
            
            bookCount--;
            book.addACopy(); //add copy back to store
            return;
        
        }

        }


    

    }


    //method to print the book list
    public void printBooks(){
        //simply run through the books and print them
        for (int n = 0; n < bookCount; n ++){ 

            System.out.println("#" + (n + 1) + ": " + bookList[n].getName());
        }

    }





    public String toString(){
        return name + ", Age: " + age + " Phone Number: " + phoneNumber;
    }



}
