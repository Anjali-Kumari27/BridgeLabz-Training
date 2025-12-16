import java.util.Scanner;
public class KilomToMile{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    double kilometers=sc.nextDouble();
    
    double Miles= Kilometers * 0.621371;
    System.out.println(kilometers + "Kilometers is equals to :" + Miles + "Miles");

    sc.close();
    }
}