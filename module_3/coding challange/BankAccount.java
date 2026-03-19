//Bank account class David Roman march 18th 2026

/*
    pseudocode



class Account


    var balance 
    var name
    var num


    func constructorDefault(Var balance, name, num)
        self.balance = balance
        self.name = name
        self.num = num




    func constructorNoBalance( name, num)
        self.balance = 0
        self.name = name
        self.num = num


    func getter
        return self.variable

    
    func setter(new_var)
        self.variable = new_var 

*/




public class BankAccount {



    //variables
    private String holder_name;
    private int accoun_num;
    private double balance;




    //constructor with all variables
    public BankAccount(String holder_name,  int accoun_num, double balance) {
        this.holder_name = holder_name; //i find it funny how java refers to its own object as 'this'. i feel like 'self' is just more simpler and better.
        this.accoun_num = accoun_num;   //i love how java is pretty similar to c but with classes, c is the best :)
        this.balance = balance;
    }

    //second construtor without balance
    public BankAccount(String holder_name,  int accoun_num) {
        this.holder_name = holder_name;
        this.accoun_num = accoun_num;
        this.balance = 0;
    }



    //****************************
    //*****GETTERS AND SETTERs*****
    //****************************
   //i did have to manually change these :(
   //(read BankAccountTest.java for context)
    
    //holder_name
    public String getHolderName() {
        return holder_name;
    }

    public void setHolderName(String holder_name) {
        this.holder_name = holder_name;
    }

  

    //accoun_num
    public int getAccounNum() {
        return accoun_num;
    }

    public void setAccountNum(int accoun_num) {
        this.accoun_num = accoun_num;
    }

    
    //balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }





    //tostring method 
    @Override
    public String toString() {
        return  " Sir " + holder_name + "\n Account #" + accoun_num + "\n Balance: $ " + balance + " CAD" ; 
    }








}