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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> li1 = inorder(root1,new ArrayList<>());
        List<Integer> li2 = inorder(root2,new ArrayList<>());
        li1.addAll(li2);
        Collections.sort(li1);
        return li1;
    }
    
    public List<Integer> inorder(TreeNode root,List<Integer> li)
    {
        if(root==null)
            return li;
        li = inorder(root.left,li);
        li.add(root.val);
        li = inorder(root.right,new ArrayList<>(li));
        return li;
    }
}