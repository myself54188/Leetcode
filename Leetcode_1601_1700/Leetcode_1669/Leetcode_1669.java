package Leetcode_1601_1700.Leetcode_1669;

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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode nodea = null;
        ListNode nodeb = null;
        ListNode tmp = list1;
        int aa = 0;
        int bb = 0;
        while (tmp != null) {
            if (aa == a - 1)
                nodea = tmp;
            if (bb == b + 1)
                nodeb = tmp;
            aa++;
            bb++;
            tmp = tmp.next;
        }
        tmp = list2;
        while (tmp.next != null)
            tmp = tmp.next;
        nodea.next = list2;
        tmp.next = nodeb;
        return list1;
    }
}