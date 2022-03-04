class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            hm.put(c,i);
        }
        
        int start = 0;
        List<Integer> result = new ArrayList<>();
        int max = 0;
        int counter = 1;
        while(start<s.length())
        {
            int val = hm.get(s.charAt(start));
            if(val>max)
                max = Math.max(val,max);
            if(start==max)
                {
                    result.add(counter);
                    counter = 0;
                }
            counter++;
            start++;
        }
        return result;
    }
}