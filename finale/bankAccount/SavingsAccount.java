

public class SavingsAccount extends Account{

 
    
    private double interestRate;


    public SavingsAccount(int accountNumber, double balance, String owner, double interestRate){

      super(accountNumber, balance, owner);

      this.interestRate = interestRate;

    

    }


    public double calulateInterest(){
        return super.getBalance() * interestRate;
    }






}
