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
    public ListNode rotateRight(ListNode head, int k) {
        int count = 0;
        if(head==null)
            return head;
        ListNode temp = head;
        while(head!=null)
        {
            head = head.next;
            count++;
        }
        k = k % count;
        k = count - k;
        head = temp;
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode l11 = l1;
        ListNode l21 = l2;
        while(k>0)
        {
            l1.next = new ListNode(head.val);
            l1 = l1.next;
            head = head.next;
            k--;
        }
        while(head!=null)
        {
            l2.next = new ListNode(head.val);
            l2 = l2.next;
            head = head.next;
        }
        l2.next = l11.next;
        return l21.next;
    }
}