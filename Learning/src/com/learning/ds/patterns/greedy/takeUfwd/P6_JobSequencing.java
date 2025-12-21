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
        Arrays.sort(jobs, (j1, j2) -> j2.profit - j1.profit);
        int maxDeadline = Arrays.stream(jobs).mapToInt(j -> j.deadline).max().getAsInt();
        int[] results = new int[maxDeadline + 1];
        Arrays.fill(results, -1);

        int maxProfit = 0;
        for(Job job : jobs) {
            for(int i = job.deadline; i >0; i-- ) {
                if(results[i] == -1) {
                    maxProfit += job.profit;
                    results[i] = job.id;
                    break;
                }
            }
        }

        System.out.println("Job Ids: " + Arrays.toString(results));
        System.out.println("Max Profit: " + maxProfit);
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
