import java.util.Scanner;
public class PerimeterOfRectangle{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    double length=sc.nextDouble();
    double breadth=sc.nextDouble();
    
    double Perimeter= 2 * (length + breadth);
    System.out.println("Perimeter of rectangle is :" + Perimeter);

    sc.close();
    }
}