package Leetcode_0201_0300.Leetcode_206;

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
    public ListNode reverseList(ListNode head) {
        /*
            快慢指针求解
         */
        // 定义快指针
        ListNode fast = head;
        // 定义慢指针
        ListNode slow = null;
        // 当快指针指向 null 时说明遍历结束
        while (fast != null) {
            // 保存快指针的下一节点
            ListNode tmp = fast.next;
            // 让快指针下一个节点指向慢指针
            fast.next = slow;
            // 将慢指针指向快指针指向节点，实现慢指针前移
            slow = fast;
            // 将快指针指向先前保存的地址，实现快指针的前移
            fast = tmp;
        }
        // 当快指针指向 null 时停止循环，这时候慢指针指向的节点为头结点
        return slow;
    }
}