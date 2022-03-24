class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i=0;
        List<Integer> li = new ArrayList<>();
        for(int p : people)
            li.add(p);
        int j=li.size()-1;
        int count = 0;
        Collections.sort(li);
        while(i<=j)
        {
            int flag = 1;
            while(i<j)
            {
                if(li.get(i)+li.get(j)<=limit)
                {
                    flag = 0;
                    count++;
                    break;
                }
                else
                    j--;
            }
            if(flag==0)
            {
                li.remove(i);
                li.remove(j-1);
            }
            else if(i==j)
            {
                count++;
                li.remove(i);
            }
            j = li.size()-1;
        }
        return count;
    }
}