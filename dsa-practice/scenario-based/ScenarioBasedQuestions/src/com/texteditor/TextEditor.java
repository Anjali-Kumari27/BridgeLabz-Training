package com.texteditor;

public class TextEditor {

    private String content = "";

    private ActionStack undoStack = new ActionStack(50);
    private ActionStack redoStack = new ActionStack(50);

    // Insert text
    public void insertText(String text) {
        content += text;
        undoStack.push(new Action("insert", text));
        redoStack.clear(); // clear redo on new action
        System.out.println("Inserted: " + text);
    }

    // Delete text
    public void deleteText(int length) {
        if (length > content.length()) {
            System.out.println("Delete not possible.");
            return;
        }

        String deleted = content.substring(content.length() - length);
        content = content.substring(0, content.length() - length);

        undoStack.push(new Action("delete", deleted));
        redoStack.clear();

        System.out.println("Deleted: " + deleted);
    }

    // Undo last action
    public void undo() {
        Action action = undoStack.pop();

        if (action == null) {
            System.out.println("Nothing to undo.");
            return;
        }

        if (action.type.equals("insert")) {
            content = content.substring(0, content.length() - action.text.length());
        } else {
            content += action.text;
        }

        redoStack.push(action);
        System.out.println("Undo done.");
    }

    // Redo last undone action
    public void redo() {
        Action action = redoStack.pop();

        if (action == null) {
            System.out.println("Nothing to redo.");
            return;
        }

        if (action.type.equals("insert")) {
            content += action.text;
        } else {
            content = content.substring(0, content.length() - action.text.length());
        }

        undoStack.push(action);
        System.out.println("Redo done.");
    }

    // Show editor content
    public void showText() {
        System.out.println("Current Text: \"" + content + "\"");
    }
}
