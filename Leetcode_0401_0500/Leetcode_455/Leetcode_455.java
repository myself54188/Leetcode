package Leetcode_0401_0500.Leetcode_455;

import java.util.Arrays;

/**
 * @Author: 程浩然
 * @Create: 2024/3/13 - 20:42
 * @Description:
 */
public class Leetcode_455 {
    public int findContentChildren(int[] g, int[] s) {
        /*
        g: 胃口
        s: 尺寸
         */
        int tmp = s.length - 1; // 饼干指针
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0; // 满足人数
        for (int i = g.length - 1; i >= 0; i--) {
            if (tmp >= 0 && s[tmp] >= g[i]) {
                ans++;
                tmp--;
            }
        }
        return ans;
    }
}



