package com.learning.ds.leetcode;

import java.util.Stack;

public class LC_057_InsertInterval {
    public static void main(String[] args) {
        Stack<Interval> stack = new Stack<>();
        stack.push(new Interval(1,2));
        stack.push(new Interval(3,5));
        stack.push(new Interval(6,7));
        stack.push(new Interval(8,10));
        stack.push(new Interval(12,16));

        insert(stack, new Interval(4,8));
        System.out.println(stack);
    }

    private static void insert(Stack<Interval> stack, Interval insertInterval) {
        if(stack.isEmpty())
            return;

        Interval removedInterval = stack.pop();
        if(removedInterval.x <= insertInterval.x && removedInterval.y >= insertInterval.x) {
            stack.push(new Interval(removedInterval.x, insertInterval.y));
        } else {
            insert(stack, insertInterval);
            Interval topInterval = stack.peek();
            if(topInterval.x <= removedInterval.x && topInterval.y >= removedInterval.x) {
                stack.pop();
                stack.push(new Interval(topInterval.x, Math.max(topInterval.y, removedInterval.y)));
            } else {
                stack.push(removedInterval);
            }
        }
    }

    private static class Interval {
        int x,y;
        public Interval(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString(){
            return "["+ x + ", " + y + "]";
        }
    }
}
