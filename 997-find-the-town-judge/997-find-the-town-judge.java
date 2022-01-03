class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1)
            return 1;
        if(trust.length==0)
            return -1;
        HashMap<Integer,Integer> trust_count = new HashMap<>();
        HashMap<Integer,Integer> has_trust = new HashMap<>();
        for(int[] arr : trust)
        {
            trust_count.put(arr[1],trust_count.getOrDefault(arr[1],0)+1);
            has_trust.put(arr[0],has_trust.getOrDefault(arr[0],0)+1);
        }
        
        int result = -1;
        for(Map.Entry<Integer,Integer> entry : trust_count.entrySet())
        {
            if(entry.getValue()==n-1 && has_trust.getOrDefault(entry.getKey(),0)==0)
            {
                return entry.getKey();
            }
        }
        return result;
    }
}