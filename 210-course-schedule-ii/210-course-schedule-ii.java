class Solution {
    HashMap<Integer,List<Integer>> hm = new HashMap<>();
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        for(int i=0;i<numCourses;i++)
        {
            hm.put(i,new ArrayList<>());
        }
        List<Integer> li = new ArrayList<>();
        createhash(prerequisites);
        int course = getcourse();
        while(course!=-1)
        {
            li.add(course);
            removecourse(course);
            course = getcourse();
        }
        int[] arr = new int[numCourses];
        if(li.size()==numCourses)
        {
            for(int i=0;i<li.size();i++)
                arr[i] = li.get(i);
            return arr;
        }
        return new int[0];
    }
    
    public void createhash(int[][] pre)
    {
        for(int[] p : pre)
        {
            List<Integer> li = hm.get(p[0]);
            li.add(p[1]);
            hm.put(p[0],li);
        }
    }
    
    public void removecourse(int course)
    {
        for(Map.Entry<Integer,List<Integer>> entry : hm.entrySet())
        {
            if(entry.getValue().contains(course))
            {
                List<Integer> li = entry.getValue();
                li.remove(Integer.valueOf(course));
                hm.put(entry.getKey(),li);
            }
        }
    }
    
    public int getcourse()
    {
        for(Map.Entry<Integer,List<Integer>> entry : hm.entrySet())
        {
            if(entry.getValue().size()==0)
            {
                hm.remove(entry.getKey());
                return entry.getKey();
            }
        }
        return -1;
    }
}