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
    public ListNode swapPairs(ListNode head) {
        ListNode li = new ListNode(0);
        ListNode li1 = li;
        while(head!=null)
        {
            if(head.next==null)
            {
                li.next = new ListNode(head.val);
                head = head.next;
                li = li.next;
            }
            else
            {
                ListNode next = head.next;
                li.next = new ListNode(next.val);
                li = li.next;
                li.next = new ListNode(head.val);
                head = next.next;
                li = li.next;
            }
        }
        return li1.next;
    }
}