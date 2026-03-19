

/*
    pseudocode


        //make new acc with all variables
        bank_account1 = new BankAccount(name, num, balance)

        print "Account 1:"
        print bank_account1
     

        //create account without balance
        bank_account2 = new BankAccount(name2, num)

        print "Account 2 (no balance):"
        print bank_account2
     

        //setter test
        call bank_account2.setters(new_name, new_num, new_balance)
        print "bank_account 2 after setters:"
        print bank_account2
    


        //getter test
        print bank_account1.getters


        ret 0 

*/














public class BankAccountTest {
    public static void main(String[] args) {


        //no i did not write bank_account for all the variables (that would be silly)
        //i simply copied my CarTest.java and replaced all words of 'Car' -> BankAccount and all words of 'car' -> 'bank_account'
        //i love vscode.
        //but vim is still superior.
        
        //test constructor with all variables
        BankAccount bank_account1 = new BankAccount("Dave Mustaine", 2918282, 0.1);
        System.out.println("Account 1:");
        System.out.println(bank_account1);
        System.out.println();


        //test constructor without balance
        BankAccount bank_account2 = new BankAccount("Lars Ulrich", 12); //(best drummer ever)
        System.out.println("Account 2 (no balance):");
        System.out.println(bank_account2);
        System.out.println();



        //setter test
        bank_account2.setBalance(2000);
        bank_account2.setHolderName("Paul Walker");
        bank_account2.setAccountNum(1021);

        System.out.println("bank_account 2 after setters:");
        System.out.println(bank_account2);
        System.out.println();



        //getter test
        System.out.println("bank_account 1 getters:");
        System.out.println("Account holder: " + bank_account1.getHolderName());
        System.out.println("Account #" + bank_account1.getAccounNum());
        System.out.println("balance:  $" + bank_account1.getBalance());
    }
}