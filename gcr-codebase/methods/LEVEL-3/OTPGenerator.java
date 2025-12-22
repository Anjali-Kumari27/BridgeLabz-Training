import java.util.Scanner;

public class OTPGenerator {


    //method to generate otp 
    public static int generateOTP() {

	//function for generating otp of 6 digit
        int otp = (int) (Math.random() * 900000) + 100000;

        return otp;

    }


    //method to check if otps are unique or not
    public static boolean areOTPsUnique(int[] otps) {
        
	int first = otps[0];
        
	//comparing to check if same or not
	for (int i = 1; i < otps.length; i++) {

            if (otps[i] != first) {

                return true;
            }

        }

	//if not unique return false
        return false;
    }





    //main method
    public static void main(String[] args) {

	//creating array to store 10 otps
        int[] otps = new int[10];


	//generating 10 otps
        for (int i = 0; i < 10; i++) {

	    //calling function
            otps[i] = generateOTP();

        }



	//printing otps
        for (int i = 0; i < 10; i++) {
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }




	//function to check if otps are unique
        boolean unique = areOTPsUnique(otps);



	//if unique print true
        if (unique) {

            System.out.println("They are unique ? " + true);

        } 

	//if not unique print false
	else {

            System.out.println("They are unique ? " + false);
        }




    }

  }