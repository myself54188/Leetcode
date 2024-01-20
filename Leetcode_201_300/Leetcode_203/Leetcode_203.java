package Leetcode_201_300.Leetcode_203;

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
    public ListNode removeElements(ListNode head, int val) {
        // 创建一个虚拟头结点
        ListNode dummyhead = new ListNode();
        dummyhead.next = head;
        // 创建指针
        ListNode tmp = dummyhead;
        while (tmp.next != null) {
            if (tmp.next.val == val) {
                tmp.next = tmp.next.next;
            } else
                tmp = tmp.next;
        }
        return dummyhead.next;
    }
}