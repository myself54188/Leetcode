package Leetcode_101_200.Leetcode_160;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 如果有链表为空，说明一定没有交点
        if (headA == null || headB == null) {
            return null;
        }
        ListNode la = headA;
        ListNode lb = headB;
        while (lb != la) {
            la = la == null ? headB : la.next;
            lb = lb == null ? headA : lb.next;
        }
        return la;
    }
}