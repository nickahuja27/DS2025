package com.learning.ds.patterns.greedy.takeUfwd;

import java.util.Arrays;

public class P6_JobSequencing {
    public static void main(String[] args) {
        Job[] arr = new Job[5];
        arr[0] = new Job(1, 4, 20);
        arr[1] = new Job(2, 1, 10);
        arr[2] = new Job(3, 2, 40);
        arr[3] = new Job(4, 2, 30);
        arr[4] = new Job(5, 1, 10);
        findMaxProfit(arr);
    }

    private static void findMaxProfit(Job[] jobs) {

    }

    private static class Job {
        public int id, profit, deadline;
        public Job(int x, int y, int z) {
            this.id = x;
            this.deadline = y;
            this.profit = z;
        }
        public String toString() {
            return "Id: " + id + ", Deadline: " + deadline + ", Profit: " + profit;
        }
    }
}
