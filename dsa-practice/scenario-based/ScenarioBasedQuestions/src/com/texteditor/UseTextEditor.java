package com.texteditor;

/*
 * TextEditor – Undo/Redo Functionality (Stack)
Story: Shanaya is building a basic text editor app. Every action (insert, delete, format) is
pushed onto a Stack. An Undo action pops from the stack, and Redo uses another stack to
reapply actions.
Requirements:
● Support insert/delete operations.
● Undo using a stack.
● Maintain redo stack separately.
*/

import java.util.Scanner;

public class UseTextEditor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TextEditor editor = new TextEditor();
        int choice;

        do {
            System.out.println("\n=========================================================");
            System.out.println("                      Text Editor Menu                     ");
            System.out.println("=========================================================\n");
            System.out.println("1. Insert Text");
            System.out.println("2. Delete Text");
            System.out.println("3. Undo");
            System.out.println("4. Redo");
            System.out.println("5. Show Text");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter text: ");
                    editor.insertText(input.nextLine());
                    break;

                case 2:
                    System.out.print("Enter number of characters to delete: ");
                    editor.deleteText(input.nextInt());
                    break;

                case 3:
                    editor.undo();
                    break;

                case 4:
                    editor.redo();
                    break;

                case 5:
                    editor.showText();
                    break;

                case 6:
                    System.out.println("\n*****************************");
                    System.out.println("       Editor is closed       ");
                    System.out.println("*****************************\n");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        input.close();
    }
}
