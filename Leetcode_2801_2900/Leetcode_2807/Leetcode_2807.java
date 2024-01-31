package Leetcode_2801_2900.Leetcode_2807;

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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode k = head.next;
        ListNode m = head;
        while (k != null) {
            int a = aaa(k.val, m.val);
            ListNode tmp = new ListNode(a);
            tmp.next = k;
            m.next = tmp;
            k = k.next;
            m = m.next.next;
        }
        return head;
    }

    private int aaa(int a, int b) {
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }
}