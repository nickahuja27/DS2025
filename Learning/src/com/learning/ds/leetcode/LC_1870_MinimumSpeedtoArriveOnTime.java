package com.learning.ds.leetcode;

public class LC_1870_MinimumSpeedtoArriveOnTime {
    public static void main(String[] args) {
        int[] dist = {1,3,2};
        int hour = 3;
        new LC_1870_MinimumSpeedtoArriveOnTime().minSpeedOnTime(dist, hour);
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        return binarySearch(dist, hour, 1, 1000);
    }

    private int binarySearch(int[] dist, double hour, int left, int right) {
        if(left > right) return -1;

        int mid = (left + right) / 2;
        if(canReachOnTime(dist, mid, hour)) {
            int retSpeed = binarySearch(dist, hour, left, mid - 1);
            return retSpeed != -1 ? retSpeed : mid;
        } else {
            return binarySearch(dist, hour, mid + 1, right);
        }
    }

    private boolean canReachOnTime(int[] dist, int speed, double hour) {
        double timeTaken = 0;
        for(int i = 0; i < dist.length; i++) {
            if(i == dist.length - 1) {
                timeTaken += (double)dist[i] / speed;
            } else {
                timeTaken += Math.ceil((double)dist[i] / speed);
            }
        }
        System.out.println("timeTaken: " + timeTaken);
        return timeTaken <= hour;
    }
}
