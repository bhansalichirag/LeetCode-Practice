class Solution {
    HashMap<Integer,List<Integer>> asso = new HashMap<>();
    List<Integer> takencourse = new ArrayList<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0;i<numCourses;i++)
        {
            asso.put(i,new ArrayList<>());
        }
        int num = 0;
        makeassociation(prerequisites);
        int course = getcourse();
        //System.out.println(course+" "+asso);
        while(course!=-1)
        {
            //System.out.println(course);
            num++;
            takencourse.add(course);
            removecourse(course);
            course = getcourse();
        }
        return num==numCourses;
    }
    
    public void makeassociation(int[][] pre)
    {
        for(int[] arr : pre)
        {
            List<Integer> li = asso.get(arr[0]);
            li.add(arr[1]);
            asso.put(arr[0],li);
        }
    }
    
    public int getcourse()
    {
        int course = -1;
        for(Map.Entry<Integer,List<Integer>> entry : asso.entrySet())
        {
            //System.out.println(entry.getValue().size());
            if(entry.getValue().size()==0 && !takencourse.contains(entry.getKey()))
            {
                asso.remove(entry.getKey());
                return entry.getKey();
            }
        }
        return course;
    }
    
    public void removecourse(int course)
    {
        for(Map.Entry<Integer,List<Integer>> entry : asso.entrySet())
        {
            if(entry.getValue().contains(course))
            {
                List<Integer> li = entry.getValue();
                li.remove(Integer.valueOf(course));
                asso.put(entry.getKey(),li);
            }
        }
    }
}