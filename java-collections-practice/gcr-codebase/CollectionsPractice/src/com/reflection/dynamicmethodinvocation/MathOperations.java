package com.reflection.dynamicmethodinvocation;

//MathOperations.java
public class MathOperations {

 public int add(int a, int b) {
     return a + b;
 }

 public int subtract(int a, int b) {
     return a - b;
 }

 public int multiply(int a, int b) {
     return a * b;
 }

 // Optional: divide method
 public int divide(int a, int b) {
     if(b == 0) throw new ArithmeticException("Division by zero");
     return a / b;
 }
}

