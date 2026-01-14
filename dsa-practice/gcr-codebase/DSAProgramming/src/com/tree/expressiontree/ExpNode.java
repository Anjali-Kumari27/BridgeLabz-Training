package com.tree.expressiontree;

public class ExpNode {
    char value;
    ExpNode left, right;

    ExpNode(char value) {
        this.value = value;
        left = right = null;
    }
}
