import java.util.Scanner;
public class AverageOfThree{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    double number1=sc.nextDouble();
    double number2=sc.nextDouble();
    double number3=sc.nextDouble();

    double Average= (number1 + number2 + number3) / 3;
    System.out.println("Average of three numbers is" + Average);

    sc.close();
    }
}