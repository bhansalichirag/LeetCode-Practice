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
    List<String> mainli = new ArrayList<>();
    public int sumRootToLeaf(TreeNode root) {
        getvalues(root,"");
        int result = 0;
        for(String str : mainli)
        {
            result+=Integer.valueOf(str,2);
        }
        return result;
    }
    
    public void getvalues(TreeNode root,String str)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
        {
            str+=Integer.toString(root.val);
            mainli.add(str);
            return;
        }
        str+=Integer.toString(root.val);
        getvalues(root.left,str);
        getvalues(root.right,str);
    }
}