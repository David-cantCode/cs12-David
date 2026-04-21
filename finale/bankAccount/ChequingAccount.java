
public class ChequingAccount extends Account{

 
    
    private double overdraftLimit;


    public ChequingAccount(int accountNumber, double balance, String owner, double overdraftLimit){

      super(accountNumber, balance, owner);

      this.overdraftLimit = overdraftLimit;

    

    }





}
