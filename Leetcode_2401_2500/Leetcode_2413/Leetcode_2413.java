package Leetcode_2401_2500.Leetcode_2413;

class Solution {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0)
            return n;
        else
            return n * 2;
    }
}