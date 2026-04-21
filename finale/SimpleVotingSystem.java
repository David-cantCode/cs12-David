import java.util.Scanner;

public class SimpleVotingSystem {

    private String candidates[];
    private int votes[]; 

    static Scanner sc = new Scanner(System.in);

    
    public void getCandidates(int n){

        candidates = new String[n];
        votes = new int[n];

        for (int x =0 ; x < n; x ++){
            System.out.print("Enter The name of Candidate: " + (x + 1) + ": " );
            candidates[x] = sc.nextLine();
           

        }

    }


    //for loop, that runs throough the arg voters, which then appends the correct votes to each candidate
    public void Vote(int voters){

        for (int x =0; x < voters; x ++){
            System.out.println("\n Voter: " + (x+1) + ", please enter your vote: " );


            //print out candiates 
            for (int i = 0; i < candidates.length; i ++ ){
                System.out.println((i+ 1) + ": " + candidates[i] );
                
            }


            while (true){
            System.out.println("Enter the number of your chosen candiate: " );

            int n = sc.nextInt();
    

            if (n > 0 && n <= candidates.length) { //make sure vote is a valid candidate
                votes[n -1] ++ ;
            
                break;
            }

            System.out.println("Invalid vote. Please enter a number between 1 and " + candidates.length );


            }


        }


    }


    //prints all candidates with their votes.
    public void Results(){

        for (int x = 0; x < candidates.length; x ++){

            System.out.println(candidates[x] + ": " + votes[x] + " votes.");
        }



    }




    public static void main(String[] args) {
        SimpleVotingSystem program = new SimpleVotingSystem();

        System.out.print("Enter the ammount of candidates: ");
        int num_candidates = sc.nextInt();
        sc.nextLine();

        program.getCandidates(num_candidates); //so i dont have to make all my methods freaking static

        
        System.out.print("Enter the ammount of voters: ");
        int voters = sc.nextInt();
        
        program.Vote(voters);


        program.Results();




    }
}