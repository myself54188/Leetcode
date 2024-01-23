package Leetcode_0801_0900.Leetcode_860;

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] arr = new int[3];
        for (int i = 0; i < bills.length; i++) {
            if (arr[0] < 0 || arr[1] < 0 || arr[2] < 0) {
                return false;
            }

            if (bills[i] == 5) {
                arr[0]++;
            }
            if (bills[i] == 10) {
                arr[0]--;
                arr[1]++;
            }
            if (bills[i] == 20) {
                if (arr[1] >= 1) {
                    arr[1]--;
                    arr[0]--;
                } else {
                    arr[0] -= 3;
                }
                arr[2]++;
            }
        }
        if (arr[0] < 0 || arr[1] < 0 || arr[2] < 0) {
            return false;
        }
        return true;
    }
}