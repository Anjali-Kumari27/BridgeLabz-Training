package com.tree.bstconstruction;

/*
 * Scenario: A library management system needs to maintain books sorted by their ISBN numbers
for quick lookups. The following ISBN numbers are to be inserted into a BST in the given order:
50, 30, 70, 20, 40, 60, 80, 10, 25.
Questions: a) Draw the resulting BST after all insertions. b) Show the sequence of
comparisons made when searching for ISBN 25. c) Perform inorder traversal on your BST and
verify the result is sorted. d) Is the following tree a valid BST? Explain why or why not:
50
/ \
30 70
/ \ / \
20 65 60 80
e) What would be the height of a completely skewed BST with the same 9 elements? Compare
with your balanced tree’s height.
Expected Analysis: Students should understand BST construction rules, validation properties,
and the importance of tree balance.

 */
import java.util.ArrayList;

public class UseBSTConstruction {

    static BSTNode root = null;

    // -------- Insert into BST --------
    static BSTNode insert(BSTNode node, int value) {

        if (node == null) {
            return new BSTNode(value);
        }

        if (value < node.data) {
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }

        return node;
    }

    // -------- Inorder Traversal --------
    static void inorder(BSTNode node, ArrayList<Integer> list) {

        if (node == null) return;

        inorder(node.left, list);
        list.add(node.data);
        inorder(node.right, list);
    }

    // -------- BST Validation using Inorder --------
    static boolean isValidBST(ArrayList<Integer> list) {

        for (int i = 1; i < list.size(); i++) {

            // If not strictly increasing → not BST
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    // -------- Height of Tree --------
    static int height(BSTNode node) {

        if (node == null) {
            return -1; // height in terms of edges
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // -------- Main Method --------
    public static void main(String[] args) {

        int[] values = {50, 30, 70, 20, 40, 60, 80, 10, 25};

        // Build BST
        for (int val : values) {
            root = insert(root, val);
        }

        // -------- Inorder Traversal --------
        ArrayList<Integer> inorderList = new ArrayList<>();
        inorder(root, inorderList);

        System.out.println("\nInorder Traversal: " + inorderList);

        // -------- BST Verification --------
        if (isValidBST(inorderList)) {
            System.out.println("\nBST Validation: VALID BST");
            System.out.println("Reason: Inorder traversal is strictly sorted.");
        } else {
            System.out.println("\nBST Validation: NOT a BST");
            System.out.println("Reason: Inorder traversal is not sorted.");
        }

        // -------- Height of Balanced BST --------
        int balancedHeight = height(root);
        System.out.println("\nHeight of balanced BST: " + balancedHeight);

        // -------- Height of Skewed BST --------
        int skewedHeight = values.length - 1;
        System.out.println("Height of completely skewed BST: " + skewedHeight);

        // -------- Comparison --------
        System.out.println("\n===========================================");
        System.out.println("                 Comparison                  ");
        System.out.println("===========================================");
        System.out.println("Balanced BST height = " + balancedHeight);
        System.out.println("Skewed BST height  = " + skewedHeight);
        System.out.println("\nConclusion: Balanced BST is more efficient.");
    }
}
