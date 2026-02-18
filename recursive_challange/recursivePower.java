import java.util.Scanner;

//recursive power thingy feb 13th David Roman

/*
    pseudocode

func power(base exp)

    //base case
    if exp == 0  
        ret 1

    
    else

        //reduction step
        ret base * power(base, exp - 1)




func main

    base = scanf 
        "Enter base"

    exp = scanf 
        "Enter exponent"



    output = call 
        power(base, exp)


    print
        base " raised to " exp "is " output

    ret 0



*/





public class recursivePower {


    //for somereason i decided to write it backwards, i dont feel like changing it tho even tho here i am writting a comment about it

    public static int power(int exponent, int base){

    if (exponent == 0) {
        return 1;
    }

    return base * power(exponent - 1, base);
    }

  


    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter the base: ");
        int b = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int e = sc.nextInt();


        int output = power(e, b);

        System.out.print(b + " to the power of " + e + " is " + output + "\n");


        sc.close();

}


}