package com.learning.ds.backtracking.verma;


public class P11_NDigitsNumbersWithDigitsInIncreasingOrder {
    public static void main(String[] args) {
        int numOfDigits = 2;
        //Min digits should be 2. If 1, then just loop 0 -> 9, else call function
        findDigits(numOfDigits, 1, 0);
    }

    private static void findDigits(int N, int index, int numSoFar) {
        if(N == 0) {
            System.out.println(numSoFar);
            return;
        }

        for(int i = index; i <= 9; i++) {
            int newNum = numSoFar * 10 + i;
            findDigits(N - 1, i + 1, newNum);
        }
    }
}
