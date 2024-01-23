package Leetcode_1201_1300.Leetcode_1290;

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
    public int getDecimalValue(ListNode head) {
        int num = 0;
        ListNode tmp = head;
        while (tmp != null) {
            num = num * 2 + tmp.val;
            tmp = tmp.next;
        }
        return num;
    }
}