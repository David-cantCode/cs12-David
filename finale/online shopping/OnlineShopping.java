import java.util.Scanner;

public class OnlineShopping {
    










    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        User user = new User("David Roman", "DavidisTall@gmail.com", "123 Main Street");
        Order order = new Order(user);

        Product p1 = new Product("Phone", 400, 12);
        Product p2 = new Product("Computer ", 1000, 28);
        Product p3 = new Product("Head Phones", 50, 3);
        Product p4 = new Product("Monitor", 200, 21);


        //greet user
        System.out.println(user.toString() + 
        "\n Hello " + user.getName() + ". Here are the items avalible: ");


        //print items
        System.out.println("1. " + p1.toString() 
        + "\n2. " + p2.toString()
        + "\n3. " + p3.toString() 
        + "\n4. " + p4.toString() );


        int quantity = 0;
        



    
        while (true){


            System.out.println("Enter the product number to add to order (or 0 to finish): ");
            int n = sc.nextInt();


        switch (n) {

            
            case 1:
                System.out.println("Enter the quantity: ");
                quantity = sc.nextInt();
                order.addProduct(p1, quantity);
                break;
            case 2:
                System.out.println("Enter the quantity: ");
                 quantity = sc.nextInt();
                 order.addProduct(p2, quantity);
                 break;
            case 3:
                System.out.println("Enter the quantity: ");
                quantity = sc.nextInt();
                order.addProduct(p3, quantity);
                break;
            case 4:
                System.out.println("Enter the quantity: ");
                 quantity = sc.nextInt();
                 order.addProduct(p4, quantity);
                 break;



            case 0: 
                order.displayOrderDetails();
                sc.close();
                return;





            default:
                System.out.println("Error theres no such thing as product: " + n);







            }        
        }






    }
}
