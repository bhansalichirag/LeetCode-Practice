class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int max = 0;
        while(i<s.length())
        {
            HashMap<Character,Integer> hm = new HashMap<>();
            hm.put(s.charAt(i),1);
            int counter = 1;
            int j=i+1;
            while(i<j && j<s.length())
            {
                if(hm.containsKey(s.charAt(j)))
                {
                    max = Math.max(max,counter);
                    break;
                }
                else
                {
                    counter++;
                    hm.put(s.charAt(j),1);
                    j++;
                }
            }
            i++;
            max = Math.max(max,counter);
        }
        return max;
    }
}