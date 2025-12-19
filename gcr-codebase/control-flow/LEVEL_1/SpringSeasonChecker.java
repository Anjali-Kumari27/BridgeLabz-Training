import java.util.Scanner;
public class SpringSeasonChecker{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    
    //taking input from the command line as month and day 
    int month = Integer.parseInt(args[0]);
    int day = Integer.parseInt(args[1]);

    
    //checking it is spring season or not as it is from March 20 to June 20
    if((month ==3 && day>=20) || (month==4 ) || (month==5) || (month==6 && day<=20))
      
      {
        System.out.println("It's a Spring Season");
      }

    else{
          System.out.println("Not a Spring Season");
        }



    input.close();

    }
}