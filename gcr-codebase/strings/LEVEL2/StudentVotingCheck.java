import java.util.Scanner;

public class StudentVotingCheck {

    // Method to generate random 2-digit ages for n students
    public int[] generateAges(int n) {

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {

            // Generate random age between 10 and 99
            ages[i] = (int) (Math.random() * 90) + 10;

        }

        return ages;
    }



    // Method to check voting eligibility
    public String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            // Validate age
            if (ages[i] < 0) {

                result[i][1] = "false";

            }
            else if (ages[i] >= 18) {

                result[i][1] = "true";

            }
            else {

                result[i][1] = "false";
            }
        }

        return result;
    }



    // Method to display result in tabular format
    public void displayResult(String[][] data) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < data.length; i++) {

            System.out.println(data[i][0] + "\t" + data[i][1]);

        }
    }





    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students : ");
        int n = input.nextInt();

        StudentVotingCheck voteAge = new StudentVotingCheck();

        // Generate ages
        int[] ages = voteAge.generateAges(n);

        // Check voting eligibility
        String[][] result = voteAge.checkVotingEligibility(ages);

        // Display output
        voteAge.displayResult(result);



        input.close();
    }
}
