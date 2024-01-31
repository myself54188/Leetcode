package Leetcode_2901_3000.Leetcode_2904;

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        // 用于存储当前遍历的子串
        String str = "";
        // 用于存储最短的美丽子串
        String str1 = "";
        // 记录当前子串中1的个数
        int cnt = 0;
        // 记录最短美丽子串的长度，初始化为0
        int min = 0;
        // j用于在发现美丽子串后，从j开始继续遍历，避免重复计算
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            // 将当前字符加入子串中
            str += s.charAt(i);
            // 如果当前字符是1，则计数器加1
            if (s.charAt(i) == '1') {
                cnt++;
            }
            // 如果当前子串中1的个数等于k，说明找到了一个美丽子串
            if (cnt == k) {
                // 重置计数器
                cnt = 0;
                // 如果这是第一个找到的美丽子串，直接赋值给str1，并更新最小长度
                if (min == 0) {
                    str1 = str;
                    min = str.length();
                    // 清空当前子串，准备寻找下一个美丽子串
                    str = "";
                } else {
                    // 如果当前子串长度小于最小长度，更新最小长度和str1
                    if (min > str.length()) {
                        min = str.length();
                        str1 = str;
                    } else if (min == str.length()) {
                        // 如果当前子串长度等于最小长度，比较字典序，更新str1
                        if (str.compareTo(str1) < 0) {
                            str1 = str;
                        }
                    }
                    // 清空当前子串，准备寻找下一个美丽子串
                    str = "";
                }
                // 将j更新为i，这样下次循环从j开始，避免重复计算
                i = j;
                j++;
            }
        }
        // 返回最短的美丽子串
        return str1;
    }
}