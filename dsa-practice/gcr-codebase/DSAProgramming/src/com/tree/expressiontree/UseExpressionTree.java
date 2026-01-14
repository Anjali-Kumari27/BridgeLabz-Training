package com.tree.expressiontree;

/*
 * Scenario: A calculator application uses expression trees to evaluate mathematical expressions.
Consider the expression: (3 + 5) × (8 - 2)
The expression tree is:
×
/ \

+ -
/ \ / \
3 5 8 2
Questions: a) Perform postorder traversal on this tree and explain how it represents the postfix
notation of the expression. b) Perform inorder traversal and show how adding parentheses
gives the original infix expression. c) Perform preorder traversal and explain how it represents
the prefix notation. d) If you were to evaluate this expression using postorder traversal, describe
the algorithm (using a stack) that would compute the final result. e) Create an expression tree
for: a × b + c / d - e, and perform all three traversals (inorder, preorder, postorder).
Expected Analysis: Students should understand the relationship between tree traversals and
expression notations (infix, prefix, postfix) and their practical applications in compiler design and
expression evaluation.

 */

public class UseExpressionTree {

    public static void main(String[] args) {

        ExpressionTreeTraversals t = new ExpressionTreeTraversals();

        /*
         * Expression: (3 + 5) × (8 - 2)
         *
         *        *
         *       / \
         *      +   -
         *     / \ / \
         *    3  5 8  2
         */

        ExpNode root = new ExpNode('*');
        root.left = new ExpNode('+');
        root.right = new ExpNode('-');

        root.left.left = new ExpNode('3');
        root.left.right = new ExpNode('5');
        root.right.left = new ExpNode('8');
        root.right.right = new ExpNode('2');

        // (a) Postorder = Postfix
        System.out.println("(a) Postorder Traversal (Postfix):");
        t.postorder(root);
        System.out.println("\nExplanation: Operators come after operands\n");

        // (b) Inorder = Infix
        System.out.println("(b) Inorder Traversal (Infix with brackets):");
        t.inorder(root);
        System.out.println("\nExplanation: Parentheses preserve order\n");

        // (c) Preorder = Prefix
        System.out.println("(c) Preorder Traversal (Prefix):");
        t.preorder(root);
        System.out.println("\nExplanation: Operator appears before operands\n");

        // (d) Evaluation using Postorder
        System.out.println("(d) Evaluation using Postfix:");
        PostOrderEvaluation eval = new PostOrderEvaluation();
        String postfix = "35+82-*";
        int result = eval.evaluatePostfix(postfix);
        System.out.println("Result = " + result + "\n");

        // (e) Expression: a × b + c / d - e
        /*
         * Expression Tree:
         *        -
         *       / \
         *      +   e
         *     / \
         *    *   /
         *   / \ / \
         *  a  b c  d
         */

        ExpNode r = new ExpNode('-');
        r.left = new ExpNode('+');
        r.right = new ExpNode('e');

        r.left.left = new ExpNode('*');
        r.left.right = new ExpNode('/');

        r.left.left.left = new ExpNode('a');
        r.left.left.right = new ExpNode('b');
        r.left.right.left = new ExpNode('c');
        r.left.right.right = new ExpNode('d');

        System.out.println("(e) Expression: a * b + c / d - e");

        System.out.print("Inorder: ");
        t.inorder(r);
        System.out.println();

        System.out.print("Preorder: ");
        t.preorder(r);
        System.out.println();

        System.out.print("Postorder: ");
        t.postorder(r);
        System.out.println();
    }
}

