import java.util.Scanner;

public class RajResultGenerator{

       //Method to take marks as input from user
       public static double[] takeMarks ( Scanner input){

              //created double array of marks to store marks of five subjects
              double[] marks = new double[5];
              System.out.println("Enter marks of 5 subjects:");

              //loop for accessing
              for ( int i = 0 ; i < 5 ; i++ ) {

                   System.out.print("Subject" + (i+1) + ": ");
                   marks[i] = input.nextDouble();

              }

              return marks;
       }


       //Method to calculate total marks
       public static double calculateTotal ( double[] marks){

              //created double variable total and initialized to 0
              double total = 0;

              for ( int i = 0 ; i < 5 ; i++ ) {

                   //marks stored in total value
                   total += marks[i];

              }
 
              //return total value
              return total;

       }


       //Method to calculate average marks 
       public static double calculateAverage ( double total){

              double average = total / 5;

              return average;
       }


       //Method to calculate grade on the basis of average marks
       public static char calculateGrade ( double average ) {

              char grade;

              //for easy calculation we are converting marks into tens digit for assigning grades
              switch((int) average / 10){


              //if it is between 9-10 print grade A
              case 10:
              case 9:
                   grade = 'A';
                   break;

              case 8:
                   grade = 'B';
                   break;
               
              case 7:
                   grade = 'C';
                   break;

              case 6:
                   grade = 'D';
                   break;

              case 5:
                   grade = 'E';
                   break;

              default:
                   grade = 'F';
          
              }

              return grade;
       }

       

       //Main method
       public static void main(String[] args) {

 
              //Taking user input
              Scanner input = new Scanner(System.in);

              double[] marks = takeMarks(input);

              //calling calculateTotal() method for total
              double total = calculateTotal(marks);

              double average = calculateAverage(total);

              char grade = calculateGrade(average);


               //displaying output
              System.out.println("\n-------------Result------------------");
              System.out.println("Total Marks      : " + total);
              System.out.println("Average of marks : " + average);
              System.out.println("Grade            : " + grade);


              input.close();

     }

}