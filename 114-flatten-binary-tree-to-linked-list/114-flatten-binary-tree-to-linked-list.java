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
    List<Integer> li = new ArrayList<>();
    public void flatten(TreeNode root) {
        preorder(root);
        TreeNode root1 = root;
        for(int i=1;i<li.size();i++)
        {
            root.right = new TreeNode(li.get(i));
            root.left = null;
            root = root.right;
        }
        root = root1;
    }
    
    public void preorder(TreeNode root)
    {
        if(root==null)
            return;
        li.add(root.val);
        preorder(root.left);
        preorder(root.right);
    } 
}