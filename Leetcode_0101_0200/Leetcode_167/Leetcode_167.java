package Leetcode_0101_0200.Leetcode_167;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a = 0;
        int b = numbers.length - 1;
        while (a != b) {
            int num = numbers[a] + numbers[b];
            if (num > target)
                b--;
            else if (num < target)
                a++;
            else
                return new int[]{a + 1, b + 1};
        }
        return new int[]{-1, -1};
    }
}