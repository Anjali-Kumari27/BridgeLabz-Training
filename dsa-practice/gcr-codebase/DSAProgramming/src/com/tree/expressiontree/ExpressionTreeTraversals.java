package com.tree.expressiontree;

public class ExpressionTreeTraversals {

    // Inorder Traversal (with brackets for infix)
    void inorder(ExpNode root) {
        if (root != null) {
            if (root.left != null) System.out.print("(");
            inorder(root.left);
            System.out.print(root.value);
            inorder(root.right);
            if (root.right != null) System.out.print(")");
        }
    }

    // Preorder Traversal (Prefix)
    void preorder(ExpNode root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder Traversal (Postfix)
    void postorder(ExpNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.value + " ");
        }
    }
}

