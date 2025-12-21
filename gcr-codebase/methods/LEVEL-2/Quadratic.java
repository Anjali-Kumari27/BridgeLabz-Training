import java.util.Scanner;

public class Quadratic {

    //method to find roots
    public static double[] findRoots(double a, double b, double c) {
      
	//finding delta using the formula
	double delta = Math.pow(b, 2) - 4 * a * c;


	//finding roots on the basis of value of delta
	//if delta is bigger than 0 then two roots are present
        if (delta > 0) {   
		
	    //finding square root of delta            
            double sqrtDelta = Math.sqrt(delta);

	    //finding both roots using Delta
            double root1 = (-b + sqrtDelta) / (2 * a);

            double root2 = (-b - sqrtDelta) / (2 * a);


            return new double[]{root1, root2};

	
        } 

        //if delta is 0 then only one root is present
        else if (delta == 0) {

	    //finding root
            double root = -b / (2 * a);

            return new double[]{root};

        } 

        //if delta is negative then no roots are present
        else {

            return new double[0];

        }


   }




    //main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter values to find roots of x : ");

	//taking input for three numbers a, b and c
        double a = input.nextDouble();         
        double b = input.nextDouble();
        double c = input.nextDouble();

	//calling function findRoots()
        double[] roots = findRoots(a, b, c);  


	//if  two roots are present then print both
        if (roots.length == 2) {

            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }

	//if one roots are present then print that
	else if (roots.length == 1) {

            System.out.println("Single root: " + roots[0]);
        } 

	//if no roots are present then print No real roots
	else {

            System.out.println("No real roots");
        }
  
   
      input.close();


  }


}