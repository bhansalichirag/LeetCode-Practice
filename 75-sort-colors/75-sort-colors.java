class Solution {
    public void sortColors(int[] nums) {
        for(int i=1;i<nums.length;i++)
        {
            int val = findpos(nums,i);
            if(val!=i)
            {
               int temp = nums[val];
                nums[val] = nums[i];
                nums[i] = temp;
                i = val;
            }
        }
    }
    
    public int findpos(int[] nums,int pos)
    {
        int val = nums[pos];
        pos--;
        while(pos>=0 && nums[pos]>val)
        {
            pos--;
        }
        return pos+1;
    }
}