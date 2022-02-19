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
    public TreeNode convertBST(TreeNode root) {
        inorder(root);
        modify(root);
        return root;
    }
    
    public void inorder(TreeNode root)
    {
        if(root==null)
            return;
        inorder(root.left);
        li.add(root.val);
        inorder(root.right);
    }
    
    public void modify(TreeNode root)
    {
        if(root==null)
            return;
        int sum = getsum(root.val);
        root.val = sum;
        modify(root.left);
        modify(root.right);
    }
    
    public int getsum(int val)
    {
        int sum = 0;
        for(int i : li)
        {
            if(i>=val)
                sum+=i;
        }
        return sum;
    }
}