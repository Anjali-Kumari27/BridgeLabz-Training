package com.functionalinterface.customfunctionalinterface.validatelogin;
/*
 * 4.Create a custom functional interface to validate user login.
 */
public class Login {
    public static void main(String[] args) {

        String inputUsername = "anjali";
        String inputPassword = "anjali@23";

        LoginValidator login = (username, password) ->
                username.equals("anjali") && password.equals("anjali@23");

        if (login.validate(inputUsername, inputPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Username or Password");
        }
    }
}

