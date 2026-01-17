package com.learning.ds.leetcode;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class LC_021_MergeTwoSortedLists {
    public static void main(String[] args) {
        LinkedList list1 = LinkedList.create(new int[]{1,2,4});
        LinkedList list2 = LinkedList.create(new int[]{1,3,4,5});
        LinkedList<Integer> mergedList = merge(list1.head, list2.head);
        mergedList.print();
    }

    private static LinkedList<Integer> merge(Node<Integer> list1, Node<Integer> list2) {
        LinkedList<Integer> mergedList = new LinkedList<>();

        while (list1 != null && list2 != null) {
            if( list1.value <= list2.value) {
                mergedList.add(list1.value);
                list1 = list1.next;
            }
            if(list1 == null || list1.value > list2.value) {
                mergedList.add(list2.value);
                list2 = list2.next;
            }
        }
        if(list1 != null) {
            while (list1 != null) {
                mergedList.add(list1.value);
                list1 = list1.next;
            }
        }

        if(list2 != null) {
            while (list2 != null) {
                mergedList.add(list2.value);
                list2 = list2.next;
            }
        }

        return mergedList;
    }
}
