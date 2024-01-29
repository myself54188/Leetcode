package Leetcode_2401_2500.Leetcode_2487;

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
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        ListNode tmp = head;
        while (tmp.next != null) {
            if (tmp.val > tmp.next.val)
                tmp.next = tmp.next.next;
            else
                tmp = tmp.next;
        }
        return reverse(head);
    }

    // 链表翻转
    public ListNode reverse(ListNode head) {
        ListNode m = null;
        ListNode k = head;
        while (k != null) {
            ListNode tmp = k.next;
            k.next = m;
            m = k;
            k = tmp;
        }

        return m;
    }
}