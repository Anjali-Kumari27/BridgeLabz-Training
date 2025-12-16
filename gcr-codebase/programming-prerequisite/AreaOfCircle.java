import java.util.Scanner;
public class AreaOfCircle{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    float rad=sc.nextFloat();
    float area=3.14 * rad * rad;
    System.out.println("Area of circle is:" + area);
    }
}