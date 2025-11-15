package com.learning.ds.recursion.verma;

import java.util.Stack;

public class P9_ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> inStack = new Stack();
        inStack.push(1);
        inStack.push(2);
        inStack.push(3);
        inStack.push(4);
        inStack.push(5);
        inStack.push(6);
        inStack.push(7);
        inStack.push(8);
        inStack.push(9);

        reverse(inStack);
        System.out.println(inStack.toString());
    }

    private static void reverse(Stack<Integer> inStack) {
        if(inStack.isEmpty()) return;

        int poppedNum = inStack.pop();
        reverse(inStack);
        insert(inStack, poppedNum);
    }

    private static void insert(Stack<Integer> inStack, int numToAdd) {
        if(inStack.isEmpty()) {
            inStack.add(numToAdd);
            return;
        }

        int poppedNum = inStack.pop();
        insert(inStack, numToAdd);
        inStack.push(poppedNum);
    }
}
