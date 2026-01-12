package com.texteditor;

//Custom stack using array
public class ActionStack {

 private Action[] stack;
 private int top;

 public ActionStack(int size) {
     stack = new Action[size];
     top = -1;
 }

 // Push action
 public void push(Action action) {
     if (top == stack.length - 1) {
         System.out.println("Stack Overflow");
         return;
     }
     stack[++top] = action;
 }

 // Pop action
 public Action pop() {
     if (top == -1) {
         return null;
     }
     return stack[top--];
 }

 // Check empty
 public boolean isEmpty() {
     return top == -1;
 }

 // Clear stack
 public void clear() {
     top = -1;
 }
}

