package com.texteditor;

//Represents one editor action
public class Action {

 String type;   // insert or delete
 String text;   // affected text

 public Action(String type, String text) {
     this.type = type;
     this.text = text;
 }
}

