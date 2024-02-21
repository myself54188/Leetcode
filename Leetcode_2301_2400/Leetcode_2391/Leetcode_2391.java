package Leetcode_2301_2400.Leetcode_2391;

class Solution {
    /**
     * @param garbage 垃圾种类
     * @param travel  行驶时间
     * @return 总时间
     */
    public int garbageCollection(String[] garbage, int[] travel) {
        int[] mrr = new int[garbage.length]; // 金属垃圾
        int[] prr = new int[garbage.length]; // 纸垃圾
        int[] grr = new int[garbage.length]; // 玻璃垃圾

        for (int i = 0; i < garbage.length; i++) {
            mrr[i] += bbb(garbage[i], 'M');
            prr[i] += bbb(garbage[i], 'P');
            grr[i] += bbb(garbage[i], 'G');
        }
        return aaa(mrr, travel) + aaa(prr, travel) + aaa(grr, travel);
    }

    private int bbb(String garbage, char ch) {
        int a = 0;
        for (int i = 0; i < garbage.length(); i++)
            if (garbage.charAt(i) == ch)
                a++;
        return a;
    }

    public int aaa(int[] arr, int[] travel) {
        boolean bool = false;
        int m = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != 0)
                bool = true;
            if (bool) {
                m += arr[i];
                m += travel[i - 1];
            }
        }
        m += arr[0];
        return m;
    }
}

