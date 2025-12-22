import java.util.*;

public class FootBallTeamHeight {
      
 
       //metho to fid sum of heights
       public  int findSum (int[] heights) {
             
             //created integer value sum which stores sum of heights
             int sum = 0;

             
                 //take value from th heights array and store in height varible
                 for (int height : heights){
    
                 //find sum by adding each value into sum
                 sum += height;
          
             }
       
             return sum;
       }



       //method to find mean of height
       public  double findMean (int[] heights) {
             
             //call findSum method to get total height
             int sum = findSum(heights);
                    
             return (double) sum / heights.length;
       }



       //method to find shortest height
       public int findShortest (int[] heights) {
             
             //assuming first player height is shortest
             int shortest = heights[0];

             //loop through all heights  the plaer
             for (int height : heights) {
          
                  //checking if current height is smaller than shortest
                  if (height < shortest) {
                     
                      //udating shortest
                      shortest = height;
                  }
             }

                    
             return shortest;
       }



       //method to find tallest height
       public  int findTallest (int[] heights) {
             
             //assuming first player height is greater
             int tallest = heights[0];

             for (int height : heights) {

                  //checking if current height is greater than tallest
                  if (height > tallest) {

                      tallest = height;
                  }
             }

                    
             return tallest;
       }





       //main method
       public static void main (String[] args) {
          
              //created integer array heights of size 11 players
              int[] heights = new int[11];   

              //created object of Randomclass to generate random numbers
              Random random = new Random();

              System.out.println("Heights of football Team Players are : ");

              for (int i = 0 ; i < heights.length ; i++){
   
                   //here nextInt generate number between  0 to 100 and +150 shifts range to 150-250 and stores in array                
                   heights[i] = random.nextInt(101) + 150;

                   //prints each height
                   System.out.print(heights[i] + " ");

              }

              System.out.println("\n");

              FootBallTeamHeight team = new FootBallTeamHeight();
 

              //calling methods 
              int sum = team.findSum(heights);
              
              double mean = team.findMean(heights);
              int shortest = team.findShortest(heights);
              int tallest  = team.findTallest(heights);


             
              //displaying the result
              System.out.print("sum of heights : " + sum + " cm\n");

              System.out.print("Mean height is : " + mean + " cm\n");
              System.out.print("Shortest height is : " + shortest + " cm\n");
              System.out.print("Tallest height is : " + tallest + " cm");

        }
  }




              