import java.util.Scanner;

public class PercentGradeCalculation {

    // Method to generate random 2-digit PCM marks for n students
    public int[][] generatePCMScores(int n) {

        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++) {

            // Random marks between 10 and 99
            scores[i][0] = (int) (Math.random() * 90) + 10; // Physics
            scores[i][1] = (int) (Math.random() * 90) + 10; // Chemistry
            scores[i][2] = (int) (Math.random() * 90) + 10; // Maths
        }

        return scores;
    }

    // Method to calculate total, average and percentage
    public double[][] calculateResult(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round off to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    // Method to calculate grade
    public String[] calculateGrade(double[][] result) {

        String[] grades = new String[result.length];

        for (int i = 0; i < result.length; i++) {

            double percentage = result[i][2];

            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        return grades;
    }

    // Method to calculate remarks based on grade
    public String[] calculateRemarks(String[] grades) {

        String[] remarks = new String[grades.length];

        for (int i = 0; i < grades.length; i++) {

            if (grades[i].equals("A")) {
                remarks[i] = "(Level 4, above agency-normalized standards)";
            } else if (grades[i].equals("B")) {
                remarks[i] = "(Level 3, at agency-normalized standards)";
            } else if (grades[i].equals("C")) {
                remarks[i] = "(Level 2, below but approaching standards)";
            } else if (grades[i].equals("D")) {
                remarks[i] = "(Level 1, well below standards)";
            } else if (grades[i].equals("E")) {
                remarks[i] = "(Level 1, too below standards)";
            } else {
                remarks[i] = "(Remedial standards)";
            }
        }

        return remarks;
    }

    // Method to display complete scorecard
    public void displayScoreCard(int[][] scores,
                                 double[][] result,
                                 String[] grades,
                                 String[] remarks) {

        System.out.println("\nPhy\tChem\tMath\tTotal\tAvg\t%\tGrade\tRemarks");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {

            System.out.println(
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    (int) result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    grades[i] + "\t" +
                    remarks[i]
            );
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students : ");
        int n = input.nextInt();

        PercentGradeCalculation pg = new PercentGradeCalculation();

        int[][] scores = pg.generatePCMScores(n);
        double[][] result = pg.calculateResult(scores);
        String[] grades = pg.calculateGrade(result);
        String[] remarks = pg.calculateRemarks(grades);

        // Display scorecard
        pg.displayScoreCard(scores, result, grades, remarks);

        input.close();
    }
}
