/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<String> li = new ArrayList<>();
    public int countUnivalSubtrees(TreeNode root) {
        subs(root);
        int counter = 0;
        for(String str : li)
        {
            List<String> l = Arrays.asList(str.split(":"));
            List<Integer> l1 = new ArrayList<>();
            for(String i : l)
            {
                if(i=="")
                    continue;
                int q = Integer.valueOf(i);
                if(!l1.contains(q))
                    l1.add(q);
            }
            if(l1.size()==1)
                counter++;
            //System.out.println(str);
        }
        return counter;
    }
    
    public String subs(TreeNode root)
    {
        if(root==null)
            return "";
        if(root.left==null && root.right==null)
        {
            li.add(new String(Integer.toString(root.val)));
            return Integer.toString(root.val);
        }
        String str = Integer.toString(root.val)+":"+subs(root.left)+":"+subs(root.right);
        li.add(new String(str));
        return str;
    }
}