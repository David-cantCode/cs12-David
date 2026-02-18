import java.util.Scanner;

//string reverser feb 17th 2026 David Roman



/*
    pseudocode

func reverseString(s)

    //base case
    if length(s) <= 1 
        ret s
    else
        //reduction step
        ret last_character_of(s) + reverseString(all_but_last_character_of(s))


func main

    input = scanf 
        "Enter a string to reverse"


    output = call 
        reverseString (input)


    print
        input "reversed is" output

    ret 0



*/





public class recursiveStringReverse {



    public static String reverseString(String s){

        if (s.length() <= 1) {
            return s;
        }

        return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
    }
    


    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter a string that you would like to reverse: ");

        //i hate how string should be captialized, another L for java!
        String s = sc.nextLine();

      
        String output = reverseString(s);

        System.out.print(s + " reversed is " + output + "\n");


        sc.close();

}


}