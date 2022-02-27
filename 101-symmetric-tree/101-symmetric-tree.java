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
    public boolean isSymmetric(TreeNode root) {
        return compareValues(root.left,root.right);
    }
    
    public boolean compareValues(TreeNode l,TreeNode r)
    {
        if(l==null && r==null)
            return true;
        
        if((l==null && r!=null ) || (r==null && l!=null))
            return false;
        else if(l.val!=r.val)
            return false;
        if(l.val==r.val)
        {
            return compareValues(l.left,r.right) && compareValues(l.right,r.left);
        }
        return true;
    }
}