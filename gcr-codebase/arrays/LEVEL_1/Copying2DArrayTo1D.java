import java.util.Scanner;
public class Copying2DArrayTo1D{
       public static void main(String[] args){
      
       Scanner input =  new Scanner(System.in);

       System.out.println("Enter number of rows : ");
       int rows = input.nextInt();

       System.out.println("Enter number of columns : ");
       int columns = input.nextInt();

       //created 2D array matrix named matrix    
       int[][] matrix = new int[rows][columns];

  
    
       //taking inputs of 2D array from the user  
       System.out.println("Enter matrix elements : ");
       for(int i = 0; i < rows ; i++){
          for(int j = 0 ; j < columns ; j++) {
             matrix[i][j] = input.nextInt();

          }
       }

     
       //created 1D array
       int[] array = new int[rows * columns];
   
       //giving index for 1D array
       int index = 0;

 

       //copying elementa fromm 2D array to 1D array
       for(int i = 0; i < rows ; i++){
          for(int j = 0 ; j < columns ; j++) {

             array[index] = matrix[i][j];
             index++;

          }
       }

     
       //printing 1D array
       System.out.print("1d array after copying elements : " );
       for(int i = 0; i < array.length ; i++ ){
          System.out.print(array[i] + " " );
       
       }



      input.close();
    
      }
}
