class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer,List<Integer>> connections = new HashMap<>();
        for(int[] edge : edges)
        {
            int A = edge[0];
            int B = edge[1];
            List<Integer> li1 = connections.getOrDefault(A,new ArrayList<>());
            List<Integer> li2 = connections.getOrDefault(B,new ArrayList<>());
            li1.add(B);
            li2.add(A);
            connections.put(edge[0],li1);
            connections.put(edge[1],li2);
        }
        HashMap<Integer,Integer> visited = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        st.push(source);
        visited.put(source,1);
        while(!st.isEmpty())
        {
            int size = st.size();
            for(int i=0;i<size;i++)
            {
                int val = st.pop();
                if(val==destination)
                    return true;
                List<Integer> li = connections.getOrDefault(val,new ArrayList<>());
                for(int j : li)
                {
                    if(!visited.containsKey(j))
                    {
                        visited.put(j,1);
                        st.push(j);
                    }
                }
            }
        }
        return false;
    }
}