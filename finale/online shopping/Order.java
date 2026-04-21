import java.util.ArrayList;


public class Order {
    
    private User user;
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Integer> quantities = new ArrayList<>(); 
    //thank god for w3schools.com for teaching me array list 
    //confusing how you cant use 'int' instead of integer but i digress

    
    public Order(User user){
        this.user = user;

    }



    public void addProduct(Product product, int quantity){

        //check if there is enough product in store
        if (product.getQuantity() < quantity){
            System.out.println("not enough product to buy. " );
            return;}


        products.add(product);
        quantities.add(quantity);

        
        product.reduceQuantity(quantity);
    }






    public double calculateTotalCost(){
        double n = 0;

        for (int i = 0; i < products.size(); i ++){


                //n +=  product price      * ammount of product
            n += (products.get(i).getPrice() * quantities.get(i)    );

        }


        return n;

    }


    public void displayOrderDetails(){

        System.out.println("Order Details for " + user.getName() + ": " );


        for (int i = 0; i < products.size(); i ++){


            //print Product 'x' quantity '= ' price*quantity
            System.out.println(products.get(i).getName() + " x " +  quantities.get(i) +  " = $" + (quantities.get(i) *  products.get(i).getPrice())   );

            //array list are super straight forward im glad i learent them :)
        }


        System.out.println("Total Cost: $" + calculateTotalCost() );
        
    }







}
