package com.learning.ds.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC_093_RestoreIPAddresses {
    public static void main(String[] args) {
        List<String> finalIpAddresses = new ArrayList<>();
        restore("25425511135", 0, new ArrayList<String>(), finalIpAddresses);
        System.out.println(finalIpAddresses);
    }

    private static void restore(String inAddresses, int index, List<String> workingIp, List<String> finalIpAddresses) {
        if(workingIp.size() > 4 || index > inAddresses.length())
            return;

        if(ipSize(workingIp) == inAddresses.length() && workingIp.size() == 4) {
            StringBuilder ipString = new StringBuilder();
            for(int i = 0; i < workingIp.size(); i++) {
                ipString.append(workingIp.get(i));
                ipString.append(".");
            }
            finalIpAddresses.add(ipString.toString());
            return;
        }

        for(int i = 1; i <= 3 && (index + i) <= inAddresses.length(); i++) {
            int intPart = Integer.parseInt(inAddresses.substring(index, index + i));
            if(intPart >= 0 && intPart <=255) {
                workingIp.add("" + intPart);
            } else {
                break;
            }
            restore(inAddresses, index + i, workingIp, finalIpAddresses);
            if(workingIp.size() > 0) {
                workingIp.remove(workingIp.size() - 1);
            }
        }
    }

    private static int ipSize(List<String> workingIp) {
        int size = 0;
        for(int i = 0; i < workingIp.size(); i++) {
            size += workingIp.get(i).length();
        }
        return size;
    }
}
