public class leetcode_palindrome_linked_list {

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

        public ListNode reverse(ListNode head){
            ListNode prevNode = null;
            ListNode curr = head;

            while(curr != null){
                ListNode next = curr.next;
                curr.next = prevNode;

                //update
                prevNode = curr;
                curr= next;

            }
            return prevNode;
        }

        public ListNode find(ListNode head){
            ListNode hare = head;
            ListNode turtle = head;
            while(hare.next != null && hare.next.next != null){
                hare = hare.next.next;
                turtle = turtle.next;
            }

            return turtle;
        }

        public boolean isPalindrome(ListNode head) {
            if(head == null || head.next == null){
                return true;
            }

            ListNode middle = find(head);
            ListNode secondHalf = reverse(middle.next);

            ListNode firstHalf = head;
            while(secondHalf != null){
                if(firstHalf.val != secondHalf.val){
                    return false;
                }

                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }
            return true;
        }
    }

}
