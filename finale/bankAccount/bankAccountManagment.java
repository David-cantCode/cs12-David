import java.util.Scanner;

public class bankAccountManagment {
    


    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int i;


        String name = "Bob Smith";

        SavingsAccount savings = new SavingsAccount(67, 900000, name, 1.02);
        
        ChequingAccount chequing = new ChequingAccount(41, 3021, name, 90);



        System.out.println("\n Greatings " + name + 
        " The balance in your chequing account #" + chequing.getAccountNumber() + " is: $" + chequing.getBalance() +
        " The balance in your savings account #" + savings.getAccountNumber() + " is: $" + savings.getBalance());

        System.out.println("The interest accumulated this period is: $" + savings.calulateInterest());



        while (true){

        System.out.println("\n Press 1 to deposit money, 2 to withdraw money, 3 to check your balance, 4 to exit");
        i = sc.nextInt();



        switch (i) {//switch cuz 'if' statements are for people who hate optimization

            case 1:
                //deposit
                System.out.println("How much would you like to deposit: ");
                savings.deposit(sc.nextDouble());
                break;
            
            
            case 2:
                //withdraw
                System.out.println("How much would you like to withdraw: ");
                savings.withdraw(sc.nextDouble());
                break;
            
            case 3:
                //check balance
                savings.checkBalance();
                break;
            case 4:
                sc.close();
                return;
                
            
            default:
                System.out.println("Error invalid number");
                break;
            




            }


        }

     

    
    }

















}
