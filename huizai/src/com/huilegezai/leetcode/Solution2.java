package com.huilegezai.leetcode;

public class Solution2 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    /**
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
       Output: 7 -> 0 -> 8
       Explanation: 342 + 465 = 807.
     * @param l1
     * @param l2
     * @return
     *
     * 就是以链表表示一个数，低位在前，高位在后，所以题中的例子就是 `342 + 465 = 807`，所以我们模拟计算即可。
     *
     */
    public static ListNode addTwoNumbers(ListNode l1,ListNode l2){

        ListNode node = new ListNode( 0 );

        ListNode n1 = l1, n2 = l2, t = node;

        int sum = 0;

        while (n1 != null || n2 != null){
            sum /= 10;
            if (n1 != null) {
                sum += n1.val;
                n1 = n1.next;
            }
            if (n2 != null) {
                sum += n2.val;
                n2 = n2.next;
            }
            t.next = new ListNode(sum % 10);
            t = t.next;
        }
        if (sum / 10 != 0) t.next = new ListNode(1);
        return node.next;


    }

    public static void main(String[] args){

    }
}
