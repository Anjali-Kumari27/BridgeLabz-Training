import java.util.Scanner;

public class YoungestTallestCheck {

    // Method To check height
    public static String tallest( double[] height, String[] friendsName ) {
      

       //assume height of first friend is greater
       double tall = height[0];

       //created index variable for array which stars with 0
       int index = 0;
       
       //iterating over array of height
       for(int i = 1 ; i < height.length ; i++ ){
           
           if (height[i] > tall ){

               tall = height[i];
               index = i;
           }
       }
       
           
       return friendsName[index];
                  
    }



   //method to check age 
    public static String youngest(double[] age , String[] friendsName ) {
      
       double young = age[0];
       int index = 0;
           
       for(int i = 1 ; i < age.length ; i++ ){
           
           if (age[i] < young ){

               young = age[i];
               index = i;
           }
       }
       
           
       return friendsName[index];


     }



      
    

    //main method
    public static void main(String[] args) {
       
         
        Scanner input = new Scanner(System.in);

        //created string array which stores name of friends
        String[] friendsName = {"Amar" , "Akbar" , "Anthony"};
  
      
        //array for height and age
        double[] height = new double[3];
        double[] age = new double[3];


       
        //created object of the class
        YoungestTallestCheck check = new YoungestTallestCheck();


        //accessing elements of array
        for(int i = 0 ; i < 3; i++ ){


           //taking user input for height
           System.out.print("Enter the height of  " + friendsName[i] + ": ");

           height[i] = input.nextDouble();
   
  
           //entered age from user
           System.out.print("Enter the age of  " + friendsName[i] + ": ");

           age[i] = input.nextDouble();
         
        }
   
           
           //storing name of friend in string variable whose height is greater and age is smaller
           String tallestFriend = tallest(height , friendsName);
           String youngestFriend = youngest(age , friendsName );
   
           System.out.print("\nYoungest friend is  : " + youngestFriend );
           System.out.print("\nTallest friend is :  " + tallestFriend );
           
                       
       
           
                

        input.close();

    }
}
