package com.learning.ds.leetcode;

import java.util.ArrayList;
import java.util.Comparator;

public class LC_759_EmployeeFreeTime {
    public static void main(String[] args) {
        LC_759_EmployeeFreeTime solution = new LC_759_EmployeeFreeTime();
        ArrayList<Interval> list = solution.createIntervals();
        list.sort(Comparator.comparingInt(interval -> interval.start));
        System.out.println(list);
    }

    private ArrayList<Interval> createIntervals() {
        ArrayList<Interval> list = new ArrayList<>();
        list.add(new Interval(1,2));
        list.add(new Interval(5,6));
        list.add(new Interval(1,3));
        list.add(new Interval(4,10));

        return list;
    }
    public class Interval {
        public int start;
        public int end;
        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public String toString() {
            return "[" + start + ", " + end + "]";
        }
    }
}
