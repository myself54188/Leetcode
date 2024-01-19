package Leetcode_141;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        int i = 0;
        while (i < 10000000) {
            if (head == null) {
                return false;
            }
            i++;
            head = head.next;
        }
        return true;
    }
}