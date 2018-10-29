package com.huilegezai.leetcode;

public class Solution83 {

    /**
     * 题意是删除链表中重复的元素，很简单，我们只需要遍历一遍链表，遇到链表中相邻元素相同时，把当前指针指向下下个元素即可。
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode curr = head;
        while (curr.next != null) {
            if (curr.next.val == curr.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args){

        ListNode L1 = ListNode.createTestData( "[1,2,2,3,3,3]" );

        ListNode.print( Solution83.deleteDuplicates( L1 ));
    }
}
