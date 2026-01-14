package com.tree.expressiontree;

import java.util.Stack;

public class PostOrderEvaluation {

    int evaluatePostfix(String postfix) {

        Stack<Integer> stack = new Stack<>();

        for (char ch : postfix.toCharArray()) {

            // If operand, push to stack
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            }
            // If operator, pop two values
            else {
                int b = stack.pop();
                int a = stack.pop();

                switch (ch) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }
}

