class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums2.length;i++)
        {
            hm.put(nums2[i],i);
        }
        int[] result = new int[nums1.length];
        Arrays.fill(result,-1);
        for(int i=0;i<nums1.length;i++)
        {
            int val = hm.get(nums1[i]);
            for(int j=val+1;j<nums2.length;j++)
            {
                if(nums2[j]>nums1[i])
                {
                    result[i] = nums2[j];
                    break;
                }
            }
        }
        return result;
    }
}