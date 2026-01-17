package com.learning.ds.leetcode;

import java.util.ArrayList;

public class LC_729_MyCalendar {
    public static void main(String[] args) {
        Interval intervalToAdd = new Interval(1,3);
        ArrayList<Interval> intervalsList = createIntervals();
        boolean added = search(intervalsList, 0, intervalsList.size() - 1, intervalToAdd);
        System.out.println(added);
        System.out.println(intervalsList);
    }

    private static boolean search(ArrayList<Interval> intervalsList, int start, int end, Interval intervalToAdd) {
        if(start > end)
            return false;

        int mid = (start + end) / 2;
        if(intervalsList.get(mid).end <= intervalToAdd.start && intervalToAdd.end <= intervalsList.get(mid + 1).start) {
            intervalsList.add(mid + 1, intervalToAdd);
            return true;
        }

        if(intervalsList.get(mid).end > intervalToAdd.start)
            return search(intervalsList, start, mid - 1, intervalToAdd);
        else
            return search(intervalsList, mid + 1, end, intervalToAdd);
    }

    private static ArrayList<Interval> createIntervals() {
        ArrayList<Interval> list = new ArrayList<>();
        list.add(new Interval(1,2));
        list.add(new Interval(3,4));
        list.add(new Interval(4,5));
        list.add(new Interval(5,6));
        list.add(new Interval(6,7));
        list.add(new Interval(7,8));
        list.add(new Interval(8,9));
        list.add(new Interval(9,10));

        return list;
    }
    public static class Interval {
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
