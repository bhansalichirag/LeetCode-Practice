class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int result = 0;
        for(int i : nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
            if(hm.get(i)>nums.length/2)
            {
                result = i;
                break;
            }
        }
        return result;
    }
}