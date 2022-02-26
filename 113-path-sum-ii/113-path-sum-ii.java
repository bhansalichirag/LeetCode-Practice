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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null)
            return li;
        getPaths(root,new ArrayList<>());
        List<List<Integer>> result = new ArrayList<>();
        //System.out.println(li);
        for(List<Integer> l : li)
        {
            int sum = 0;
            for(int i : l)
            {
                sum+=i;
            }
            if(sum==targetSum)
            {
                result.add(new ArrayList<>(l));
            }
        }
        return result;
    }
    
    public void getPaths(TreeNode root,List<Integer> l)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            l.add(root.val);
            li.add(new ArrayList<>(l));
            return;
        }
        l.add(root.val);
        getPaths(root.left,new ArrayList<>(l));
        getPaths(root.right,new ArrayList<>(l));
    }
}