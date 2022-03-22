class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int count = 0;
        for(char c: s.toCharArray())
        {
            hm.put(c,count);
            count++;
        }
        count = 0;
        List<Integer> li = new ArrayList<>();
        while(count<s.length())
        {
            int val = 1;
            int last = hm.get(s.charAt(count));
            while(last>count)
            {
                last = Math.max(last,hm.get(s.charAt(count)));
                count++;
                val++;
            }
            li.add(val);
            count++;
        }
        return li;
    }
}