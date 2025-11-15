package com.learning.ds.recursion.verma;

import java.util.Stack;

public class P8_DeleteMiddleElementOfStack {
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

        delete(inStack, 0, inStack.size());
        System.out.println(inStack.toString());
    }

    private static void delete(Stack<Integer> inStack, int index, int size) {
        if(inStack.isEmpty() || index == size)
            return;

        int poppedNum = inStack.pop();
        delete(inStack, index + 1, size);
        if(index != size/2) {
            inStack.push(poppedNum);
        }
    }
}
