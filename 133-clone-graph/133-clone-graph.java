/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)
            return null;
        HashMap<Integer,List<Integer>> hm = new HashMap<>();
        Queue<Node> li = new LinkedList<>();
        li.add(node);
        while(!li.isEmpty())
        {
            Node temp = li.remove();
            if(!hm.containsKey(temp.val))
            {
                List<Integer> l = new ArrayList<>();
                for(Node n : temp.neighbors)
                {
                    l.add(n.val);
                    li.add(n);
                }
                hm.put(temp.val,l);
            }
        }
        HashMap<Integer,Node> hm1 = new HashMap<>();
        for(Map.Entry<Integer,List<Integer>> entry : hm.entrySet())
        {
            Node n = new Node(entry.getKey());
            hm1.put(entry.getKey(),n);
        }
        for(Map.Entry<Integer,Node> entry: hm1.entrySet())
        {
            Node n = entry.getValue();
            int val = entry.getKey();
            List<Integer> li2 = hm.get(val);
            List<Node> li1 = new ArrayList<>();
            for(int i : li2)
            {
                li1.add(hm1.get(i));
            }
            n.neighbors = li1;
        }
        for(Map.Entry<Integer,Node> entry: hm1.entrySet())
        {
            return entry.getValue();
        }
        return new Node();
    }
}