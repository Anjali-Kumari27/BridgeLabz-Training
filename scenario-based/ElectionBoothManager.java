import java.util.Scanner;

public class ElectionBoothManager {

    // Method to check if voter is eligible to vote or not
    public static boolean isEligible(int age) {

        // Voting age must be 18 or above
        if (age >= 18) {

            return true;

        } 

        else {

            return false;

        }

    }



    // Method to display candidates
    public static void showCandidates() {

        System.out.println("Choose your candidate : ");
        System.out.println("1. Candidate A");
        System.out.println("2. Candidate B");
        System.out.println("3. Candidate C");

    }





    // Method to record vote
    public static void recordVote(int vote, int[] votes) {

        switch (vote) {
            case 1:
                votes[0]++;
                System.out.println(" Vote recorded for Candidate A ");
                break;

            case 2:
                votes[1]++;
                System.out.println(" Vote recorded for Candidate B ");
                break;

            case 3:
                votes[2]++;
                System.out.println(" Vote recorded for Candidate C ");
                break;

            default:
                System.out.println(" Invalid vote. Vote not counted ");
        }
    }




    // Method to display final results
    public static void displayResult(int[] votes) {

        System.out.println("\n Election Results");
        System.out.println("-------------------------------");
        System.out.println("Candidate A Votes: " + votes[0] + " votes");
        System.out.println("Candidate B Votes: " + votes[1] + " votes");
        System.out.println("Candidate C Votes: " + votes[2] + " votes");
    }






    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array to store votes of candidates
        int[] votes = new int[3];

        System.out.println("Welcome to Election Booth");
        System.out.println("Enter age to vote");
        System.out.println("Enter -1 to stop voting\n");


        // Loop for multiple voters
        while (true) {

            System.out.print("Enter voter age: ");
            int age = input.nextInt();


            // Exit condition
            if (age == -1) {

                break;

            }

            // Check eligibility
            if (!isEligible(age)) {

                System.out.println("Not eligible to vote\n");
                continue;

            }


            System.out.println("Eligible to vote");

            showCandidates();


            System.out.print("Enter your vote (1 / 2 / 3): ");
            int vote = input.nextInt();

            recordVote(vote, votes);

        }



        // Display final vote count
        displayResult(votes);

        System.out.println("\nThank you for using Election Booth System");


        input.close();


    }
}
