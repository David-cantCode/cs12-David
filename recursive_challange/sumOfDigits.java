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
        
        //base case, if n == 0 there are no more digits left to add
        if (n == 0) {
            return 0;
        }



        //reduction step
        //%10 - get last digit
        // /10 - remove last digiit
        // then add the digit

        //ex:

        //sumDigits(41)
        //= 4 + sumDigits(1)
        //= 4 + (1 + sumDigits(0))
        //= + 4 + 1 + 0
        //= 5
        
        return (n % 10) + sumDigits(n / 10);
    }




    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);

        //get input from the user and store it in n (number)
        
        System.out.print("Enter a number to sum the digits of:  ");
        int n = sc.nextInt();



        //call our recursive function and set its return value to the variable output 
        int output = sumDigits(n);




        System.out.print("The sum of the digits "+ n + " is "+ output + "\n");


        sc.close();

}


}