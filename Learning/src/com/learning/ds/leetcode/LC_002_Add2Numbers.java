package com.learning.ds.leetcode;

import java.util.LinkedList;
import java.util.List;

public class LC_002_Add2Numbers {
    public static void main(String[] args) {
        List<Integer> number1 = new LinkedList<>();
        List<Integer> number2 = new LinkedList<>();

        number1.add(2);
        number1.add(4);
        number1.add(3);

        number2.add(5);
        number2.add(6);
        number2.add(4);

        List<Integer> retList = add(number1, number2);
        System.out.println(retList);
    }

    private static List<Integer> add(List<Integer> number1, List<Integer> number2) {
        List<Integer> retList = new LinkedList<>();
        int carryOver = 0;
        for(int i = 0; i < number1.size(); i++) {
            int num1 = number1.get(i);
            int num2 = number2.get(i);
            int sum = (num1 + num2 + carryOver) % 10;
            carryOver = (num1 + num2 + carryOver) / 10;
            retList.add(sum);
        }
        if(carryOver > 0) {
            retList.add(carryOver);
        }

        return retList;
    }
}
