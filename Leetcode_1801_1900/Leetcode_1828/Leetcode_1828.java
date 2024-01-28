package Leetcode_1801_1900.Leetcode_1828;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int r = queries[i][2];

            for (int j = 0; j < points.length; j++) {
                int x = points[j][0];
                int y = points[j][1];
                double jl = sqrt(pow(a - x, 2) + pow(b - y, 2));
                if (jl <= (double) r)
                    answer[i]++;
            }
        }
        return answer;
    }
}