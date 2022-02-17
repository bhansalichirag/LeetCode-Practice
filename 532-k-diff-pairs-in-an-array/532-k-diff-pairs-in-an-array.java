class Solution {
    public int findPairs(int[] nums, int k) {
        List<Integer> li = new ArrayList<>();
        int ret = 0;
        if(k==0)
        {
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int i : nums)
            {
                hm.put(i,hm.getOrDefault(i,0)+1);
            }
            
            for(Map.Entry<Integer,Integer> entry : hm.entrySet())
            {
                if(entry.getValue()>1)
                    ret+=1;
            }
            return ret;
        }
        for(int i : nums)
            if(!li.contains(i))
                li.add(i);
        //Collections.sort(li);
        for(int i : li)
        {
            if(li.contains(i+k))
                ret++;
        }
        return ret;
    }
}