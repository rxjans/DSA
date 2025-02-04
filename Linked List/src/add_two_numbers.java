public class add_two_numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode curr = res;

        int carry = 0;

        while(l1 != null || l2 != null){

            int sum = carry + 0;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum/10;
            sum = sum%10;
            curr.next = new ListNode(sum);
            curr = curr.next;
        }

        if(carry == 1) {
            curr.next = new ListNode(1);
        }
        return res.next;
    }
}
