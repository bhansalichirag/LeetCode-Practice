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
    public ListNode deleteDuplicates(ListNode head) {
        TreeMap<Integer,Integer> hm = new TreeMap<>();
        while(head!=null)
        {
            hm.put(head.val,hm.getOrDefault(head.val,0)+1);
            head = head.next;
        }
        
        ListNode l = new ListNode(0);
        ListNode l1 = l;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
        {
            if(entry.getValue()==1)
            {
                l.next = new ListNode(entry.getKey());
                l = l.next;
            }
        }
        return l1.next;
    }
}