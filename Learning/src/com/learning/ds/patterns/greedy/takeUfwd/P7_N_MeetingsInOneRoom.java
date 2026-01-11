package com.learning.ds.patterns.greedy.takeUfwd;

import java.util.ArrayList;
import java.util.Arrays;

/*
Maximize the numbers of meetings using one single room.
 */
public class P7_N_MeetingsInOneRoom {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] =   {2,4,5,7,9,9};
        ArrayList<Meeting> meetings = new ArrayList<>();

        for(int i = 0; i < start.length; i++)
            meetings.add(new Meeting(start[i], end[i], i+1));

        maximizeNumOfMeetings(meetings);
    }

    private static void maximizeNumOfMeetings(ArrayList<Meeting> inMeetings) {
        
    }

    private static class Meeting {
        int start;
        int end;
        int pos;

        Meeting(int start, int end, int pos)
        {
            this.start = start;
            this.end = end;
            this.pos = pos;
        }

        public String toString() {
            return new StringBuilder().append("\n pos:").append(pos).append(", Start:").append(start).append(", End: ").append(end).toString();
        }
    }
}
