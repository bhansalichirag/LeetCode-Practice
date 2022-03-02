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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode l3 = new ListNode(0);
        ListNode l31 = l3;
        while(l1!=null || l2!=null)
        {
            int val1 = 0;
            int val2 = 0;
            int sum = 0;
            if(l1!=null)
            {
                val1 = l1.val;
                l1 = l1.next;
            }
            if(l2!=null)
            {
                val2 = l2.val;
                l2 = l2.next;
            }   
            sum+=val1+val2+carry;
            carry = sum/10;
            sum%=10;
            l3.next = new ListNode(sum);
            l3 = l3.next;
            
        }
        if(carry!=0)
            l3.next = new ListNode(carry);
        return l31.next;
    }
}