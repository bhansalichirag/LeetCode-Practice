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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        int counter = 0;
        while(!que.isEmpty())
        {
            int size = que.size();
            List<Integer> li = new ArrayList<>();
            while(size>0)
            {
                TreeNode t = que.remove();
                li.add(t.val);
                if(t.left!=null)
                    que.add(t.left);
                if(t.right!=null)
                    que.add(t.right);
                size--;
            }
            if(!check(counter,li))
                return false;
            counter++;
        }
        return true;
    }
    
    public boolean check(int counter,List<Integer> li)
    {
        if(counter%2==0)
        {
            //odd
            if(li.get(0)%2==0)
                return false;
            for(int i=1;i<li.size();i++)
            {
                if(li.get(i)%2==0)
                    return false;
                if(li.get(i)<=li.get(i-1))
                    return false;
            }
        }
        else
        {
            if(li.get(0)%2==1)
                return false;
            for(int i=1;i<li.size();i++)
            {
                if(li.get(i)%2==1)
                    return false;
                if(li.get(i)>=li.get(i-1))
                    return false;
            }
        }
        return true;
    }
}