package com.learning.ds.patterns.slidingwindow.verma;

import java.util.LinkedList;
import java.util.Queue;

public class P6_FindMaxInSubArrays {
    public static void main(String[] args) {
        int[] inArray = {1, 3, -1, -3, -5, 3, 6, 7};
        findMax(inArray, 3);
    }

    private static void findMax(int[] inArray, int windowSize) {
        int start = 0;
        int end = 0;
        Queue<Integer> queue = new LinkedList<>();

        while (end < inArray.length) {
            while (!queue.isEmpty() && queue.peek() <= inArray[end])
                queue.remove();
            queue.add(inArray[end]);

            if(end - start + 1 < windowSize)
                end++;
            else {
                System.out.print(" " + queue.peek());
                if(inArray[start] == queue.peek())
                    queue.remove();

                start++;
                end++;
            }
        }
    }
}
