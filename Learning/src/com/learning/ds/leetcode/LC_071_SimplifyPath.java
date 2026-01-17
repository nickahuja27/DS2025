package com.learning.ds.leetcode;

import java.util.Stack;
import java.util.StringTokenizer;

public class LC_071_SimplifyPath {
    public static void main(String[] args) {
        String dir = "/a/./b/../../c/d/";
        String simplifiedString = simplify(dir);
        System.out.println(simplifiedString);
    }

    private static String simplify(String dir) {
        StringTokenizer tokenizer = new StringTokenizer(dir, "/");
        Stack<String> stack = new Stack<>();
        while (tokenizer.hasMoreElements()) {
            String nextToken = tokenizer.nextToken();
            if(nextToken.equals("."))
                continue;
            else if(!stack.isEmpty() && nextToken.equals(".."))
                stack.pop();
            else
                stack.push(nextToken);
        }

        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.insert(0, stack.pop());
            builder.insert(0, "/");
        }
        return builder.toString();
    }
}
