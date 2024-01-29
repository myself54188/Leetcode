package Leetcode_2101_2200.Leetcode_2130;

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
    public int pairSum(ListNode head) {
        ListNode m = head;
        ListNode k = head.next;
        while (k.next != null) {
            k = k.next.next;
            m = m.next;
        }

        // 翻转后半部分
        ListNode fk = m.next; // 得到后半部分的开始节点
        ListNode fm = null;
        while (fk != null) {
            ListNode temp = fk.next;
            fk.next = fm;
            fm = fk;
            fk = temp;
        }

        int max = Integer.MIN_VALUE;
        m = head; // 在这之前慢指针还指向一半位置，将慢指针放回到开始位置
        while (k != null) {
            max = Math.max(max, k.val + m.val);
            k = k.next;
            m = m.next;
        }
        return max;
    }
}