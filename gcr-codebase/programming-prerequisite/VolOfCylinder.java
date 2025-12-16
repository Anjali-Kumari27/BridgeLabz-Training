import java.util.Scanner;
public class VolOfCylinder{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    double rad=sc.nextDouble();
    double heig=sc.nextDouble();
    double volume= (Math.PI * rad * rad * heig);
    System.out.println("Volume of Cylinder is :" + volume);
    }
}