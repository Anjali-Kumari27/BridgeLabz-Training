import java.util.*;


public class FactorFinding {

    //method to find factors of number
    public static int[] findFactors(int number) {
    

           //count number of factors
           int count = 0;

           for(int i = 1; i <= number ; i++) {
              if (number % i == 0) {
                 count++;
              }
           }

           //created array of factors according to required size
           int[] factors = new int[count];

           //index for array
           int index = 0;

           //loop to store factors in array
           for (int i = 1 ; i <= number ; i++) {

               if (number % i == 0){

                   factors[index] = i;
     
                   //incrementing index
                   index++ ;
               }
           }
           
           return factors;
     }


     //method to find greatest factor using array of factors
     public static int greatestFactor(int[] factors) {
      
            //assuming first factor is greatest
            int greatest = factors[0];

            //accessing through for each loop
            for (int factor : factors){

                 //checking if current factor is greater than greatest
                 if(factor > greatest){

                    //updating greatest
                    greatest = factor;

                 }
            }
 
            return greatest;
     }


     //method to find sum of factors
     public static int sumOfFactors(int[] factors){
        
            int sum = 0;

            for(int factor : factors){
               
                //adding factor to sum variable
                sum += factor;
            }
        
            return sum;

     }


     //method to find product of factors
     public static long productOfFactors(int[] factors) {
 
             //created variable named product to store product
             long product = 1;

             for(int factor : factors){

                //calculating product
                product *= factor;
             }

             return product;
       
     }


     //method to find product of cube of factors
     public static double productOfCubeOfFactors(int[] factors) {
 
             double product = 1;

             for(int factor : factors){
                
                //calculating cube of factors and adding them in product
                product *= Math.pow(factor, 3);

             }

             return product;
       
     }



     //main method
     public static void main(String[] args) {
       
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number : ");

            int number = input.nextInt();

            //factors array calling findFactors() method
            int[] factors = findFactors(number);


            //displaying factors
            System.out.print("Factors are : ");

            for (int f: factors) {

                 System.out.print( f + " ");
            }


            //printing result
            System.out.println("\nGreatest Factor               : " + greatestFactor(factors));
            System.out.println("Sum of Factors                : " + sumOfFactors(factors));
            System.out.println("Product of Factors            : " + productOfFactors(factors));
            System.out.println("Product of cube of Factors    : " + productOfCubeOfFactors(factors));
            
             

            input.close();

      }
 }


