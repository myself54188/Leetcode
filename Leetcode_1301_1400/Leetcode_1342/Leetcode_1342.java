package Leetcode_1301_1400.Leetcode_1342;

class Solution {
    public int numberOfSteps(int num) {
        int sum = 0;
        while (num != 0) {
            if (num % 2 == 0)
                num /= 2;
            else
                num--;
            sum++;
        }
        return sum;
    }
}