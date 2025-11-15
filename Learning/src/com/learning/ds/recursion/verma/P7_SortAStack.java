package com.learning.ds.recursion.verma;

import java.util.Stack;

public class P7_SortAStack {
    public static void main(String[] args) {
        Stack<Integer> inStack = new Stack();
        inStack.push(3);
        inStack.push(6);
        inStack.push(1);
        inStack.push(9);
        inStack.push(4);
        inStack.push(2);
        inStack.push(5);
        inStack.push(8);
        inStack.push(7);

        sort(inStack);
        System.out.println(inStack.toString());
    }

    private static void sort(Stack<Integer> inStack) {
        if(inStack.isEmpty())
            return;

        int poppedNum = inStack.pop();
        sort(inStack);
        insertNum(inStack, poppedNum);
    }

    private static void insertNum(Stack<Integer> inStack, int numToAdd) {
        if(inStack.isEmpty() || inStack.peek() < numToAdd) {
            inStack.push(numToAdd);
            return;
        }

        int poppedNum = inStack.pop();
        insertNum(inStack, numToAdd);
        inStack.push(poppedNum);
    }
}
