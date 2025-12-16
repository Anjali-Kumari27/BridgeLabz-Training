import java.util.Scanner;
public class TempConver{
     public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     float Cel=sc.nextFloat();
     float Fah=(Cel * 9/5)+32;

     System.out.println("After conversion from Celsius to Fahrenheit :" + Fah);
     }
}