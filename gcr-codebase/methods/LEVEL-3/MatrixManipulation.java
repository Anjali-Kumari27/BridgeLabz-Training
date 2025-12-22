import java.util.Scanner;

public class MatrixManipulation {

        // Create a random matrix with given rows and columns
        public static double[][] createRandomMatrix(int rows, int cols) {

        // Allocate 2D array
        double[][] m = new double[rows][cols];

              // Fill each cell with random integer 0–9
              for (int i = 0; i < rows; i++) {

                   for (int j = 0; j < cols; j++) {

                       m[i][j] = (int) (Math.random() * 10);

                   }
               }

               // Return the filled matrix
               return m;
          }


          // Find transpose of a matrix
          public static double[][] transposeMatrix(double[][] m) {

                // Rows of original matrix
                int rows = m.length;

                // Columns of original matrix
                int cols = m[0].length;

                // Allocate transposed matrix with swapped sizes
                double[][] t = new double[cols][rows];

                // Copy each element to swapped position
                for (int i = 0; i < rows; i++) {

                     for (int j = 0; j < cols; j++) {

                         t[j][i] = m[i][j];
                     }
                }

                 // Return transpose
                 return t;
           }




           // Find determinant of a 2x2 matrix
           public static double determinant2x2(double[][] m) {

               // Read elements
               double a = m[0][0];
               double b = m[0][1];
               double c = m[1][0];
               double d = m[1][1];

               // Compute determinant
               double det = a * d - b * c;

              // Return determinant
              return det;
          }




          // Find determinant of a 3x3 matrix using standard formula
          public static double determinant3x3(double[][] m) {

               // taking variable for easy computation
               double a = m[0][0];
               double b = m[0][1];
               double c = m[0][2];
               double d = m[1][0];
               double e = m[1][1];
               double f = m[1][2];
               double g = m[2][0];
               double h = m[2][1];
               double i = m[2][2];

               // Using formula for determinant 
               double det = a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);

               // Return determinant
               return det;
          }




          // Find inverse of a 2x2 matrix using adjoint / determinant
          public static double[][] inverse2x2(double[][] m) {

              // Compute determinant first
             double det = determinant2x2(m);

             // Create result matrix
             double[][] inv = new double[2][2];

            // Place swapped diagonal elements and other elements
            inv[0][0] =  m[1][1] / det;
            inv[0][1] = -m[0][1] / det;
            inv[1][0] = -m[1][0] / det;
            inv[1][1] =  m[0][0] / det;

            // Return inverse
            return inv;
          }



   
         // Find inverse of a 3x3 matrix using adjoint / determinant
         public static double[][] inverse3x3(double[][] m, double det) {

             // Create matrix to hold cofactors
             double[][] cof = new double[3][3];

            // Compute each cofactor 
            cof[0][0] =  (m[1][1] * m[2][2] - m[1][2] * m[2][1]);
            cof[0][1] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]);
            cof[0][2] =  (m[1][0] * m[2][1] - m[1][1] * m[2][0]);

            cof[1][0] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]);
            cof[1][1] =  (m[0][0] * m[2][2] - m[0][2] * m[2][0]);
            cof[1][2] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]);

            cof[2][0] =  (m[0][1] * m[1][2] - m[0][2] * m[1][1]);
            cof[2][1] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]);
            cof[2][2] =  (m[0][0] * m[1][1] - m[0][1] * m[1][0]);
 
            // Transpose cofactor matrix to get adjoint
            double[][] adj = transposeMatrix(cof);

           // Create matrix for inverse
           double[][] inv = new double[3][3];

           // Divide each element of adjoint by determinant
           for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                 inv[i][j] = adj[i][j] / det;
               }
           }

          // Return inverse
          return inv;
       }



       // Print a matrix to the screen
       public static void printMatrix(double[][] m) {
	
          // Print one value followed by a space
          for (int i = 0; i < m.length; i++) {
               for (int j = 0; j < m[0].length; j++) {
                  System.out.print(m[i][j] + " ");
               }

               // Move to next line after each row
               System.out.println();
         }
          System.out.println();
       }






    // main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read number of rows
        System.out.print("Enter number of rows : ");
        int rows = input.nextInt();

        // Read number of columns
        System.out.print("Enter number of columns : ");
        int cols = input.nextInt();

        // Create a random matrix with given size
        double[][] matrix = createRandomMatrix(rows, cols);

        // Print the original matrix
        System.out.println("\nOriginal matrix:");
        printMatrix(matrix);

        // Find the transpose of the matrix
        double[][] transpose = transposeMatrix(matrix);

        // Print the transpose
        System.out.println("\nTranspose:");
        printMatrix(transpose);

        // If matrix is 2x2, work with 2x2 determinant and inverse
        if (rows == 2 && cols == 2) {

            // Find determinant of 2x2 matrix
            double det2 = determinant2x2(matrix);

            // Print determinant of 2x2
            System.out.println("\nDeterminant (2x2): " + det2);

            // Check if determinant is not zero for inverse
            if (Math.abs(det2) > 1e-9) {

                // Find inverse of 2x2 matrix
                double[][] inv2 = inverse2x2(matrix);

                // Print inverse of 2x2
                System.out.println("\nInverse (2x2):");
                printMatrix(inv2);
            } 

	    else {

                //inverse does not exist
                System.out.println("Inverse (2x2) does not exist (determinant is 0)");
            }
        }

        // If matrix is 3x3, work with 3x3 determinant and inverse
        if (rows == 3 && cols == 3) {

            // Find determinant of 3x3 matrix
            double det3 = determinant3x3(matrix);

            // Print determinant of 3x3
            System.out.println("Determinant (3x3): " + det3);

            // Check if determinant is not zero for inverse
            if (Math.abs(det3) > 1e-9) {

                // Find inverse of 3x3 matrix
                double[][] inv3 = inverse3x3(matrix, det3);

                // Print inverse of 3x3
                System.out.println("Inverse (3x3):");
                printMatrix(inv3);
            } 

	    else {

                // inverse does not exist
                System.out.println("Inverse (3x3) does not exist (determinant is 0)");
            }
        }
    

   
       input.close();

    }

    
 }