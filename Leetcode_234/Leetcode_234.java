package Leetcode_234;

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
    public boolean isPalindrome(ListNode head) {
        StringBuilder str = new StringBuilder();
        ListNode tmp = head;
        while (tmp != null) {
            str.append(tmp.val);
            tmp = tmp.next;
        }
        return str.toString().contentEquals(str.reverse());
    }
}