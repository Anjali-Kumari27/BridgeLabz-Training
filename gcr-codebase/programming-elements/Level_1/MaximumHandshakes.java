import java.util.Scanner;
public class MaximumHandshakes{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    
    
    int numberOfStudents = input.nextInt();
    
    //calculating number of handshakes
    int numberOfHandshakes = (numberOfStudents * (numberOfStudents -1))/2;



    //displaying the maximum number of possible handshakes
    System.out.println("The maximum number of possible HandShakes among  " + numberOfStudents + " students is " + numberOfHandshakes);

    input.close();

    }
}