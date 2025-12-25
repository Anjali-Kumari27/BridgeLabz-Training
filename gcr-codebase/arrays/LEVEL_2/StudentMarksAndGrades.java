import java.util.Scanner;

public class StudentMarksAndGrades {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking number of students
        System.out.print("Enter number of students: ");

        int n = input.nextInt();


        // Arrays to store marks
        double[] physics = new double[n];

        double[] chemistry = new double[n];
        double[] maths = new double[n];



        // Arrays to store percentage, grade and remarks
        double[] percentage = new double[n];

        char[] grade = new char[n];
        String[] remarks = new String[n];



        // Taking marks input
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = input.nextDouble();

            System.out.print("Chemistry: ");
            chemistry[i] = input.nextDouble();

            System.out.print("Maths: ");
            maths[i] = input.nextDouble();


            // Validation for negative marks
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Marks cannot be negative. Please enter again.");

                // repeat input for same student
                i--; 

                continue;

            }



            // Calculating percentage
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

            // Calculating grade and remarks
            if (percentage[i] >= 80) {
                grade[i] = 'A';
                remarks[i] = "(Level 4, above agency-normalized standards)";
            } 

            else if (percentage[i] >= 70) {
                grade[i] = 'B';
                remarks[i] = "(Level 3, at agency-normalized standards)";
            } 

            else if (percentage[i] >= 60) {
                grade[i] = 'C';
                remarks[i] = "(Level 2, below, but approaching agency-normalized standards)";
            } 

            else if (percentage[i] >= 50){
                grade[i] = 'D';
                remarks[i] = "(Level 1, well below agency-normalized standards)";
            }

            else if (percentage[i] >= 40){
                grade[i] = 'E';
                remarks[i] = "(Level 1-, too below agency-normalized standards)";
            }

            else {
                grade[i] = 'R';
                remarks[i] = "Remedial standards";
            }

        }





        // Displaying results
        System.out.println("\n----------- Student Report -----------");

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics    : " + physics[i]);
            System.out.println("Chemistry  : " + chemistry[i]);
            System.out.println("Maths      : " + maths[i]);
            System.out.println("Percentage : " + percentage[i] + "%");
            System.out.println("Grade      : " + grade[i]);
            System.out.println("Remarks    : " + remarks[i]);
        }



        input.close();
    }
}
