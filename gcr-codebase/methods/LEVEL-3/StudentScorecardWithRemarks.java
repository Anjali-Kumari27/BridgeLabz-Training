import java.util.Scanner;

public class StudentScorecardWithRemarks {


    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths
    public int[][] generateScores(int numStudents) {

        // created 2D array to store score of 3 subjects Physics, Chemistry, Maths
        int[][] scores = new int[numStudents][3]; 

        for (int i = 0; i < numStudents; i++) {

            for (int j = 0; j < 3; j++) {

                // Random 10-99
                scores[i][j] = 10 + (int) (Math.random() * 90);  

           }

        }

        return scores;
    }




    // Method to calculate total, average, percentage, and remarks for each student
    public Object[][] calculateTotalsAndRemarks(int[][] scores) {

        int numStudents = scores.length;
 
        // total, average, percentage, remarks
        Object[][] result = new Object[numStudents][4]; 

        for (int i = 0; i < numStudents; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;

            // Each subject max = 100
            double percentage = (total / 300.0) * 100; 


            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;

            percentage = Math.round(percentage * 100.0) / 100.0;



            // Assign remarks based on percentage
            String remarks;

            if (percentage >= 80) {

                remarks = "(Level 4, above agency-normalized standards)";

            } 

            else if (percentage >= 70) {

                remarks = "(Level 3, at agency-normalized standards)";

            } 

            else if (percentage >= 60) {

                remarks = "(Level 2, below , but approaching agency-normalized standards)";

            } 

            else if (percentage >= 50) {

                remarks = "(Level 1, well below agency-normalized standards)";

            } 

            else if (percentage >= 40) {

                remarks = "(Level 1-, too below agency-normalized standards)";

            } 

            else {

                remarks = "(Remedial standards)";

            }



            // Store results
            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
            result[i][3] = remarks;

        }

        return result;
    }




    // Method to display scorecard in a neat tabular format
    public void displayScorecard(int[][] scores, Object[][] totalsAndRemarks) {

        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tRemarks");

        System.out.println("-------------------------------------------------------------------------------------------------");



        for (int i = 0; i < scores.length; i++) {
            System.out.print("S" + (i + 1) + "\t");
            System.out.print(scores[i][0] + "\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t");
            System.out.print(totalsAndRemarks[i][0] + "\t");
            System.out.print(totalsAndRemarks[i][1] + "\t");
            System.out.print(totalsAndRemarks[i][2] + "%\t\t");
            System.out.println(totalsAndRemarks[i][3]);


        }
    }







    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        StudentScorecardWithRemarks scoreOfStudent = new StudentScorecardWithRemarks();

        // Generate random scores for students
        int[][] scores = scoreOfStudent.generateScores(numStudents);

        // Calculate total, average, percentage, and remarks
        Object[][] totalsAndRemarks = scoreOfStudent.calculateTotalsAndRemarks(scores);

        // Display the complete scorecard
        scoreOfStudent.displayScorecard(scores, totalsAndRemarks);

        input.close();
    }
}
