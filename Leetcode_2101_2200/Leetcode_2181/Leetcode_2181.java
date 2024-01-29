package Leetcode_2101_2200.Leetcode_2181;

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
    public ListNode mergeNodes(ListNode head) {
        ListNode tmp1 = head; // 题目给的链表的指针
        ListNode aaa = new ListNode(0);
        ListNode tmp2 = aaa; // 返回链表的指针
        while (tmp1.next != null) {
            if (tmp1.val == 0) {
                tmp2.next = new ListNode(0);
                tmp2 = tmp2.next;
            } else {
                tmp2.val += tmp1.val;
            }
            tmp1 = tmp1.next;
        }
        return aaa.next;
    }
}
