import java.util.Scanner;

public class RecursivePrimeChecker{





    public static boolean isPrime(int n, int i){

        if (n <= 1)
            return false;

        if (i == 1)
            return true;

        if (n % i == 0)
            return false;

        return isPrime(n, i - 1);
    }



    public static void main(String[] args) {
    
        

   
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
  
        
        if ( isPrime(n, n -1 )){
            System.out.println("\n" + n + " is a prime number");
        }
        else {
            System.out.println("\n" + n + " is not a prime number"); }





        sc.close();

    }



}
