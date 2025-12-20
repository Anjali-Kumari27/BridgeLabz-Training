import java.util.Scanner;

public class YoungestTallestFriend{
       public static void main(String args[]){
        
       Scanner input = new Scanner(System.in);
    
     
       //created string array for the friends name
       String[] friends = {" Amar ", " Akbar ", " Anthony "};
       
       //created two array for storing age and height of them 
       int[] age = new int[3];
       double[] height = new double[3];
      

       //asking user to give input for age
       System.out.print("age of three friends are : ");

       for(int i=0 ; i < 3 ; i++){
           age[i] = input.nextInt();
       }
      

       //taking user input for height
       System.out.print("height of three friends are : ");
       for(int j=0 ; j < 3 ; j++){
          height[j] = input.nextInt();
       }


       //created variable name minAge and assigned 0 to it which helps to find minimum age among them
       int minAge = 0;
    
       //we take index of age array named i
       for(int i=0 ; i < 3 ; i++){
          
          //comparing if enterd age is minimum or not
          if( age[i]<age[minAge] ){
    
            //updating minimum age variable by innserting age in them that will be compared 
            minAge = i;

          }
       }



      //created variable name maxHeight and assigned 0 to it
      int maxHeight = 0;

      //we take index j for height array
      for(int j=0 ; j < 3 ; j++){
          
          //comparing height enterd by user with maxHeight
          if( height[j]>height[maxHeight] ){

            //updating max height
            maxHeight = j;

          }
       }





      //printing the result
      System.out.println("Youngest friend is : " + friends[minAge] + " of age " + age[minAge]);

      System.out.println("Tallest friend is : " + friends[maxHeight] + " of height " + height[maxHeight]);





      input.close();

      }
}