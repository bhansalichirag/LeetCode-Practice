/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    List<Integer> li = new ArrayList<>();
    public Node inorderSuccessor(Node node) {
        Node temp = node;
        while(temp.parent!=null)
            temp = temp.parent;
        inorder(temp);
        //inorder(node.left);
        //inorder(node.right);
        Collections.sort(li);
        for(int i : li)
        {
            if(i>node.val)
                return new Node(i);
        }
        return null;
    }
    
    public void inorder(Node node)
    {
        if(node==null)
            return;
        inorder(node.left);
        li.add(node.val);
        inorder(node.right);
    }
}