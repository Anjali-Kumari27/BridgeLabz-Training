package com.exceptionhandling.customexception;

//Custom exception class
class InvalidAgeException extends Exception {

 // Constructor to pass error message
 public InvalidAgeException(String message) {
     super(message);
 }
}

