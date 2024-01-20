package Leetcode_0001_0100.Leetcode_2;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String a = "";
        String b = "";

        ListNode tmp1 = l1;
        ListNode tmp2 = l2;

        while (true) {
            a = (tmp1.val + "") + a;
            tmp1 = tmp1.next;
            if (tmp1 == null) {
                break;
            }
        }

        while (true) {
            b = (tmp2.val + "") + b;
            tmp2 = tmp2.next;
            if (tmp2 == null) {
                break;
            }
        }


        String d = addLargeNumber(a, b);
        ListNode hear = new ListNode();
        ListNode tmp = hear;
        for (int i = d.length() - 1; i >= 0; i--) {
            tmp.next = new ListNode(d.charAt(i) - '0');
            tmp = tmp.next;
        }
        return hear.next;
    }

    public static String addLargeNumber(String a, String b) {

        // 数字字符串a，b的倒数索引
        int aIndex = 1;
        int bIndex = 1;
        // 进位
        int flag = 0;
        String res = "";
        while (aIndex <= a.length() || bIndex <= b.length() || flag > 0) {
            // 找到字符串倒数第 i 位上的数字
            int aNum = aIndex <= a.length() ? a.charAt(a.length() - aIndex) - '0' : 0;
            int bNum = bIndex <= b.length() ? b.charAt(b.length() - bIndex) - '0' : 0;
            // 将两个数字相加
            res = (aNum + bNum + flag) % 10 + res;
            // 判断是否进位
            flag = (aNum + bNum + flag) / 10;
            aIndex++;
            bIndex++;
        }
        return res;
    }

}