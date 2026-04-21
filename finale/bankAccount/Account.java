
public class Account {

    private int accountNumber;
    private double balance;
    private String owner;
    
    
    public Account(int accountNumber, double balance, String owner){

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    

    }




    public void deposit(double ammount){
        this.balance += ammount;
    }

    public void withdraw(double ammount){
        this.balance -= ammount;
    }


    public void checkBalance(){
        System.out.println("balance: "+ balance);
    }





    //getters

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getOwner(){
        return owner;
    }








}
