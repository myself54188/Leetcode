package Leetcode_0301_0400.Leetcode_349;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr = new int[10001];
        for (int i = 0; i < nums1.length; i++) {
            arr[nums1[i]] = 1;
        }
        for (int i = 0; i < nums2.length; i++) {
            if (arr[nums2[i]] == 1) {
                arr[nums2[i]] = 2;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                list.add(i);
            }
        }
        int[] brr = new int[list.size()];
        for (int i = 0; i < brr.length; i++) {
            brr[i] = list.get(i);
        }
        return brr;
    }
}