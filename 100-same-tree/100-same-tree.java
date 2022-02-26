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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        String p_str = getStr(p,"");
        String q_str = getStr(q,"");
        //System.out.println(p_str+"  "+q_str);
        return p_str.equals(q_str);
    }
    
    public String getStr(TreeNode root,String str)
    {
        if(root==null)
            return str;
        str = getStr(root.left,str+"L");
        str+=root.val+"Root";
        return getStr(root.right,str+"R");
    }
}