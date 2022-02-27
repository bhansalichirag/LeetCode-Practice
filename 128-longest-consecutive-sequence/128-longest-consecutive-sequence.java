class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums)
        {
            hm.put(i,1);
        }
        List<Integer> li = new ArrayList<>(hm.keySet());
        Collections.sort(li);
        int[] arr = new int[li.size()];
        Arrays.fill(arr,1);
        int max = 1;
        for(int i=1;i<li.size();i++)
        {
            if(li.get(i)-li.get(i-1)==1)
                arr[i] = arr[i-1]+1;
            max = Math.max(arr[i],max);
        }
        return max;
    }
}