class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> li1 = new HashMap<>();
        HashMap<Integer,Integer> li2 = new HashMap<>();
        li1 = createhash(nums1,nums2);
        li2 = createhash(nums3,nums4);
        int ret = 0;
        for(Map.Entry<Integer,Integer> entry : li1.entrySet())
        {
            int val = entry.getKey();
            if(li2.containsKey(val*-1))
                ret+=entry.getValue()*li2.get(val*-1);
        }
        return ret;
    }
    
    
    public HashMap<Integer,Integer> createhash(int[] nums1,int[] nums2)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                int val = nums1[i]+nums2[j];
                hm.put(val,hm.getOrDefault(val,0)+1);
            }
        }
        return hm;
    }
}