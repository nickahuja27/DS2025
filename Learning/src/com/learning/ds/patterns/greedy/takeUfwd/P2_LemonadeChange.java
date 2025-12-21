package com.learning.ds.patterns.greedy.takeUfwd;

public class P2_LemonadeChange {
    public static void main(String[] args) {
        int[] customerWithBills = {5,5,10,10,20};
        int costOfLemonade = 5;
        findNumOfLemonadesSold(costOfLemonade, customerWithBills);
    }

    private static void findNumOfLemonadesSold(int costOfLemonade, int[] customerWithBills) {
        int bill_5 = 0;
        int bill_10 = 0;
        int bill_20 = 0;
        int lemonadesSold = 0;

        for(int i = 0; i < customerWithBills.length; i++) {
            if(customerWithBills[i] == 5) {
                bill_5++;
                lemonadesSold++;
            } else if(customerWithBills[i] == 10) {
                if(bill_5 > 0) {
                    bill_5--;
                    bill_10++;
                    lemonadesSold++;
                }
            } else if(customerWithBills[i] == 20) {
                if(bill_5 > 3) {
                    bill_5 -= 3;
                    lemonadesSold++;
                } else if (bill_5 > 1 && bill_10 > 1) {
                    bill_5--;
                    bill_10--;
                    bill_20++;
                    lemonadesSold++;
                }
            }
        }

        System.out.println("Number of Lemonades sold: " + lemonadesSold);
    }
}
