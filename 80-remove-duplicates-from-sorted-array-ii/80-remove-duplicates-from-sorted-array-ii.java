class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = nums[0];
        int isprev_occured = 0;
        int ret = 1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==prev)
            {
                if(isprev_occured==1)
                    nums[i]=Integer.MAX_VALUE;
                else
                {
                    ret++;
                    isprev_occured = 1;
                }
            }
            else
            {
                isprev_occured = 0;
                prev = nums[i];
                ret++;
            }
        }
        
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i]==Integer.MAX_VALUE)
            {
                int j = i+1;
                while(j<nums.length && nums[j]==Integer.MAX_VALUE)
                    j++;
                if(j<nums.length)
                {
                    nums[i] = nums[j];
                    nums[j] = Integer.MAX_VALUE;
                }
            }
        }
        return ret;
    }
}