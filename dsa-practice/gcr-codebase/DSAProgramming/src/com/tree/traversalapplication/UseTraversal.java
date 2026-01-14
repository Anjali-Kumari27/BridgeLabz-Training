package com.tree.traversalapplication;

/*
 * Scenario: A file system is represented as a tree structure:
root
/ \
home var
/ \ \
user docs log
/
config
You need to implement different operations:
Questions: a) If you want to list all files in alphabetical order, which traversal should you use if
this were a BST? b) To calculate the total size of a directory (sum of all files in subdirectories),
which traversal is most appropriate? c) To create a backup by copying the entire directory
structure starting from the root, which traversal would you use? d) Perform inorder, preorder,
and postorder traversals on the above tree. e) Explain how postorder traversal can be used to
safely delete the entire directory structure.
Expected Analysis: Students should understand practical applications of different traversal
methods and when to use each type.

 */

public class UseTraversal {

    // -------- Preorder Traversal (Root → Children) --------
    static void preorder(FileNode node) {
        if (node == null) return;

        System.out.print(node.name + " ");
        for (FileNode child : node.children) {
            preorder(child);
        }
    }

    // -------- Postorder Traversal (Children → Root) --------
    static void postorder(FileNode node) {
        if (node == null) return;

        for (FileNode child : node.children) {
            postorder(child);
        }
        System.out.print(node.name + " ");
    }

    // -------- Inorder Traversal (BST concept – first 2 children) --------
    static void inorder(FileNode node) {
        if (node == null) return;

        if (node.children.size() > 0)
            inorder(node.children.get(0));

        System.out.print(node.name + " ");

        if (node.children.size() > 1)
            inorder(node.children.get(1));
    }

    public static void main(String[] args) {

        // -------- Build File System Tree --------
        FileNode root = new FileNode("root");

        FileNode home = new FileNode("home");
        FileNode var = new FileNode("var");

        FileNode user = new FileNode("user");
        FileNode docs = new FileNode("docs");
        FileNode log = new FileNode("log");

        FileNode config = new FileNode("config");

        root.addChild(home);
        root.addChild(var);

        home.addChild(user);
        home.addChild(docs);

        var.addChild(log);

        user.addChild(config);

        // -------- a) Alphabetical Listing --------
        System.out.println("a) Alphabetical order (BST concept): Inorder Traversal");
        System.out.println("Reason: Inorder traversal of BST gives sorted order.\n");

        // -------- b) Directory Size Calculation --------
        System.out.println("b) Directory size calculation: Postorder Traversal");
        System.out.println("Reason: Child sizes are calculated before parent.\n");

        // -------- c) Backup Creation --------
        System.out.println("c) Backup creation: Preorder Traversal");
        System.out.println("Reason: Root directory is created before subdirectories.\n");

        // -------- d) Traversal Outputs --------
        System.out.print("d) Preorder Traversal: ");
        preorder(root);
        System.out.println();

        System.out.print("   Inorder Traversal: ");
        inorder(root);
        System.out.println();

        System.out.print("   Postorder Traversal: ");
        postorder(root);
        System.out.println("\n");

        // -------- e) Safe Deletion Explanation --------
        System.out.println("e) Safe Deletion using Postorder Traversal:");
        System.out.println("Reason: Files and subdirectories are deleted first,");
        System.out.println("then parent directory is deleted at last.");
    }
}
