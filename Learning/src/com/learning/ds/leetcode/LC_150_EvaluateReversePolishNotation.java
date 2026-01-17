package com.learning.ds.leetcode;

import java.util.Stack;

public class LC_150_EvaluateReversePolishNotation {
    static String operators = "+-*/";
    public static void main(String[] args) {
        String[] input = {"4", "13", "5", "/", "+"};
        int result = solve(input);
        System.out.println(result);
    }

    private static int solve(String[] input) {
        Stack<Integer> stack = new Stack<>();
        for (String inStr : input) {
            if(operators.indexOf(inStr) == -1) {
                stack.push(Integer.parseInt(inStr));
            } else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                if(inStr.equals("+")) {
                    stack.push(num1 + num2);
                } else if(inStr.equals("-")) {
                    stack.push(num1 - num2);
                } else if(inStr.equals("*")) {
                    stack.push(num1 * num2);
                } else if(inStr.equals("/")) {
                    stack.push(num1 / num2);
                }
            }
        }

        return stack.pop();
    }
}
