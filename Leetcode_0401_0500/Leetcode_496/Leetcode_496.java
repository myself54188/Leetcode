package Leetcode_0401_0500.Leetcode_496;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int a = nums1[i];
            int j = 0;
            for (j = 0; j < nums2.length; j++) {
                if (nums2[j] == a) {
                    break;
                }
            }
            int max = -1;
            for (int k = j; k < nums2.length; k++) {
                if (nums2[k] > a) {
                    max = nums2[k];
                    break;
                }
            }
            list.add(max);
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
