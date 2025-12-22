import java.util.Scanner;                                 

public class MatrixOperations {    

    // Method to create a random matrix with given rows and columns
    public static int[][] createRandomMatrix(int rows, int cols) {

        // Allocate 2D array
  	int[][] matrix = new int[rows][cols];              

        for (int i = 0; i < rows; i++) {  
                
            for (int j = 0; j < cols; j++) {  

		// Fill with random 0–9            
                matrix[i][j] = (int) (Math.random() * 10); 

            }
        }

	// Return created matrix
        return matrix;       
                              
    }

    
    
    // Method to add two matrices of same size
    public static int[][] addMatrices(int[][] A, int[][] B) {

	// Number of rows and columns
        int rows = A.length;       
                        
        int cols = A[0].length;                            

	// Result matrix
        int[][] result = new int[rows][cols];              


	// Add corresponding elements
        for (int i = 0; i < rows; i++) {  
                 
            for (int j = 0; j < cols; j++) {   
            
                result[i][j] = A[i][j] + B[i][j];    
      
            }
        }

	// Return sum matrix
        return result;                                     
    }



    // Method to subtract matrix B from matrix A (A - B)
    public static int[][] subtractMatrices(int[][] A, int[][] B) {

	// Number of rowsand columns
        int rows = A.length;     
                          
        int cols = A[0].length;                            

        // Result matrix
	int[][] result = new int[rows][cols];              

	// Subtract corresponding elements
        for (int i = 0; i < rows; i++) {   
                
            for (int j = 0; j < cols; j++) {    
           
                result[i][j] = A[i][j] - B[i][j];    
      
            }
        }

	// Return difference matrix
        return result;                                     
    }



    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
       
	// Rows and columns of both A and B
	int rowsA = A.length;         
                     
        int colsA = A[0].length;                           
        int rowsB = B.length;                              
        int colsB = B[0].length;                           

	// Result matrix (rowsA x colsB)
        int[][] result = new int[rowsA][colsB];            


	//Accumulator for cell (i,j)
        for (int i = 0; i < rowsA; i++) {  
               
            for (int j = 0; j < colsB; j++) {   
           
                int sum = 0;     


		// Loop over inner dimension                         
                for (int k = 0; k < colsA; k++) {     
		  
		    // Multiply and add     
                    sum = sum + A[i][k] * B[k][j]; 
        
                }

		// Store computed value
                result[i][j] = sum;    
                    
            }
        }

	// Return product matrix
        return result;                                    
    }




    
    // Helper method to print a matrix with a title
    public static void printMatrix(String title, int[][] matrix) {
   
   	// Print title line
        System.out.println(title + ":");                  

	// Print element with space
        for (int i = 0; i < matrix.length; i++) {   
      
            for (int j = 0; j < matrix[0].length; j++) {   

                System.out.print(matrix[i][j] + " ");     
            }

            System.out.println();                
          
        }

        System.out.println();                              
    }







    // main method
    public static void main(String[] args) {               
        Scanner input = new Scanner(System.in);              

	// Read number of rows and columns for matrix A
        System.out.print("Enter number of rows for matrix A : ");
        int rowsA = input.nextInt();   

        System.out.print("Enter number of columns for matrix A : ");             
        int colsA = input.nextInt();                          

 
       // Read number of rows and columns for matrix B
       System.out.print("Enter number of rows for matrix B : ");
       int rowsB = input.nextInt();     

       System.out.print("Enter number of columns for matrix B : ");                     
       int colsB = input.nextInt();                          


	// Create random matrix A and B
        int[][] A = createRandomMatrix(rowsA, colsA);     
        int[][] B = createRandomMatrix(rowsB, colsB);      


	// Print matrix A & B
        printMatrix("Matrix A", A);                        
        printMatrix("Matrix B", B);                        



	// Check if A and B have same size
        if (rowsA == rowsB && colsA == colsB) {            
          
	    // Add matrices using method 
	    int[][] sum = addMatrices(A, B);  

	    // Print result of addition             
            printMatrix("Matrix addition (A + B)", sum);                     

	    //Subtract matrices using function
            int[][] diff = subtractMatrices(A, B);   

     	    // Print result of subtraction
            printMatrix("Matrix subtraction (A - B)", diff); 
                   
        } 
     
        else {
          
           System.out.println("Addition and Subtraction is not possible\n");
        }



	// Check if multiplication A*B is possible
        if (colsA == rowsB) {  

	    // Multiply A and B                       
            int[][] prodAB = multiplyMatrices(A, B);       

	    // Print product AB
            printMatrix("Matrix multiplication (A * B)", prodAB);                  
        }
     
        else {
          
           System.out.println("Multiplication not possible");
        }



	// Check if multiplication B*A is possible
        if (colsB == rowsA) {        

	    // Multiply B and A                     
            int[][] prodBA = multiplyMatrices(B, A);       

	    // Print product BA
            printMatrix("Matrix multiplication (B * A)", prodBA);                  
        }
   
        else {
          
           System.out.println("Multiplication not possible");
        }


    
        input.close();

    }
 }