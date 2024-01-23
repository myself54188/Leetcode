package Leetcode_0801_0900.Leetcode_876;

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
    public ListNode middleNode(ListNode head) {
        ListNode tmp = head;
        int sum = 0;
        while (tmp != null) {
            sum++;
            tmp = tmp.next;
        }
        sum = (sum / 2) + 1;
        int tmp1 = 0;
        tmp = head;
        while (true) {
            tmp1++;
            if (tmp1 == sum) {
                return tmp;
            }
            tmp = tmp.next;
        }
    }
}