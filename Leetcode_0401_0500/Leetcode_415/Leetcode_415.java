package Leetcode_0401_0500.Leetcode_415;

import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger bigInteger1 = new BigInteger(num1);
        BigInteger bigInteger2 = new BigInteger(num2);
        return bigInteger1.add(bigInteger2).toString();
    }
}