import java.util.Scanner;


//sum of digits feb 18th David Roman

/*
    pseudocode

func sumDigits(n)

    //base case
    if n == 0  
        ret 0

    
    else

        //reduction step
        ret (n % 10) + sumDigits(n / 10);




func main

    n = scanf 
        "Enter base"

    output = call 
        sumDigits(n)


    print
        "the sum of the digits " n "is " output  
        

    ret 0
    



*/





public class sumOfDigits {



    public static int sumDigits(int n) {
        
        if (n == 0) {
            return 0;
        }

        
        return (n % 10) + sumDigits(n / 10);
    }




    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter a number to sum the digits of:  ");
        int n = sc.nextInt();


        int output = sumDigits(n);


        System.out.print("The sum of the digits "+ n + " is "+ output + "\n");


        sc.close();

}


}