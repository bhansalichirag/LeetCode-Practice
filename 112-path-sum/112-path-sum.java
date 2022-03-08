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
    List<List<Integer>> li = new ArrayList<>();
    public boolean hasPathSum(TreeNode root, int targetSum) {
        getPaths(root,new ArrayList<>());
        //System.out.println(li);
        for(List<Integer> l : li)
        {
            int sum = 0;
            for(int i : l)
                sum+=i;
            
            if(sum==targetSum)
                return true;
        }
        return false;
    }
    
    public void getPaths(TreeNode root,List<Integer> temp)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
        {
            temp.add(root.val);
            li.add(new ArrayList<>(temp));
            return;
        }
        temp.add(root.val);
        getPaths(root.left,new ArrayList<>(temp));
        getPaths(root.right,new ArrayList<>(temp));
    }
}