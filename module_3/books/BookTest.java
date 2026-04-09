public class BookTest {
    

    public static void main(String[] args){


        Book b1 = new Book("Harry Potter", 100);
        //test book 
        System.out.println("Book 1:");
        System.out.println(b1);


        System.out.println("\n Setter n getter test for book 1: ");

        b1.setNumberInStore(67);
        System.out.println(b1.getNumberInStore());



        Book b2 = new Book("The Hobbit");
        System.out.println("\n Book 2 (with no specified number of store copies): ");
        System.out.println(b2);


        System.out.println("\nAdding a copy of the Hobbit");
        b2.addACopy();
        System.out.println("\nCoppies of the hobbit: " + b2.getNumberInStore());
        System.out.println("Selling a copy of the Hobbit");
        b2.sellACopy();
        System.out.println("\nCoppies of the hobbit after sell: " + b2.getNumberInStore());
        System.out.println("setting 21 copies of the hobbit");
        b2.setNumberInStore(21);
        System.out.println("\nCoppies of the hobbit after set: " + b2.getNumberInStore());



        

        Person p1 = new Person("David", 17, "123 345 6789" );
        System.out.println("\nPerson 1: ");
        System.out.println(p1);

        System.out.println("\n Setter n getter test for person 1: ");

        p1.setAge(16);
        p1.setName("Addison");
        p1.setPhoneNumber("987 654 321");
        System.out.println(p1.getAge());
        System.out.println(p1.getName());
        System.out.println(p1.getPhoneNumber());


       
        System.out.println("\nCurrent books:");
        p1.printBooks();

        System.out.println("\nBuying harry potter....");
        p1.buyBook(b1);
    

        System.out.println("\nBuying the hobbit ....");
        p1.buyBook(b2);
    

        System.out.println("Coppies of the hobbit left: " + b2.getNumberInStore());
        System.out.println("Coppies of the harry potter left: " + b1.getNumberInStore());


        System.out.println("\nCurrent books:");
        p1.printBooks();        



        System.out.println("\n Selling Harry Potter");
        p1.sellBook(b1);

        System.out.println("\nCurrent books:");
        p1.printBooks();        



    } 


}
