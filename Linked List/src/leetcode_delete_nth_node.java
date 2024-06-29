public class leetcode_delete_nth_node {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if(head.next == null){
                return null;
            }

            int size = 0;
            ListNode curr = head;
            while(curr != null){
                curr = curr.next;
                size++;
            }

            if(size == n){
                return head.next;
            }

            //node searching
            int index = size - n;
            ListNode prevNode = head;
            int i = 1;
            while(i < index){
                prevNode = prevNode.next;
                i++;
            }

            prevNode.next = prevNode.next.next;

            return head;
        }
    }
}
