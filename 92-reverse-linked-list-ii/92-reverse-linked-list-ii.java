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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<Integer> li = new ArrayList<>();
        int counter = 1;
        ListNode li1 = head;
        while(head!=null)
        {
            if(counter>=left && counter<=right)
            {
                li.add(head.val);
            }
            head = head.next;
            counter++;
        }
        head = li1;
        ListNode li2 = new ListNode(0);
        ListNode li22= li2;
        counter = 1;
        while(counter<left)
        {
            li2.next = new ListNode(head.val);
            head = head.next;
            li2 = li2.next;
            counter++;
        }
        for(int i=li.size()-1;i>=0;i--)
        {
            li2.next = new ListNode(li.get(i));
            li2 = li2.next;
            head = head.next;
        }
        while(head!=null)
        {
            li2.next = new ListNode(head.val);
            head = head.next;
            li2 = li2.next;
        }
        return li22.next;
    }
}