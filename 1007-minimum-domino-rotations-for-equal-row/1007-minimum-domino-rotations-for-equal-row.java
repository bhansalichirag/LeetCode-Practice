class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        HashSet<Integer> top = new HashSet<>();
        HashSet<Integer> bottom = new HashSet<>();
        for(int i : tops)
            top.add(i);
        for(int i : bottoms)
            bottom.add(i);
        int max = Integer.MAX_VALUE;
        for(int i : top)
        {
            max = Math.min(max,getVal(i,tops,bottoms));
        }
        for(int i : bottom)
        {
            max = Math.min(max,getVal(i,bottoms,tops));
        }
        return max == Integer.MAX_VALUE ? -1 : max;
    }
    
    public int getVal(int val,int[] arr1,int[] arr2)
    {
        int count = 0;
        for(int i=0;i<arr1.length;i++)
        {
            if(val==arr1[i])
                continue;
            else if(val!=arr1[i] && val!=arr2[i])
                return Integer.MAX_VALUE;
            else if(val!=arr1[i] && val==arr2[i])
                count++;
        }
        return count;
    }
}