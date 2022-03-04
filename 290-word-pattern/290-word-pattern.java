class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hm1 = new HashMap<>();
        HashMap<String,Character> hm2 = new HashMap<>();
        String[] parts = s.split(" ");
        if(parts.length!=pattern.length())
            return false;
        for(int i=0;i<parts.length;i++)
        {
            char c = pattern.charAt(i);
            if(hm1.containsKey(c) && !hm1.get(c).equals(parts[i]))
            {
                return false;
            }
            else if(hm2.containsKey(parts[i]) && hm2.get(parts[i])!=c)
            {
                return false;
            }
            else if(!hm1.containsKey(c) && !hm2.containsKey(parts[i]))
            {
                hm1.put(c,parts[i]);
                hm2.put(parts[i],c);
            }
        }
        return true;
    }
}