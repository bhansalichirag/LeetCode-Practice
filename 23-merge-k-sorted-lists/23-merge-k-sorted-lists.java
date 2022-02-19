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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode li = new ListNode(0);
        ListNode li1 = li;
        if(lists.length==0)
            return null;
        if(lists.length==1)
            return lists[0];
        List<ListNode> li_node = new ArrayList<>();
        int num_null = 0;
        for(ListNode l : lists)
            if(l==null)
                num_null++;
        while(num_null!=lists.length)
        {
            int start = -1;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<lists.length;i++)
            {
                if(lists[i]!=null && lists[i].val<min)
                {
                    start = i;
                    min = lists[i].val;
                }
            }
            if(start!=-1)
            {
                li.next = new ListNode(lists[start].val);
                li = li.next;
                lists[start] = lists[start].next;
                if(lists[start]==null)
                    num_null++;
            }
        }
        return li1.next;
    }
}