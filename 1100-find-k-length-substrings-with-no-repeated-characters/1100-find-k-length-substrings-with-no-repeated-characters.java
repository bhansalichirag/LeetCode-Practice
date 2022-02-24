class Solution {
    HashMap<Character,Integer> hm = new HashMap<>();
    public int numKLenSubstrNoRepeats(String s, int k) {
        if(s.length()<k)
            return 0;
        String sub = s.substring(0,k);
        int result = 0;
        char[] arr = sub.toCharArray();
        for(char c : arr)
        {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        if(check())
            result++;
        for(int i=k;i<s.length();i++)
        {
            char rem = s.charAt(i-k);
            char c = s.charAt(i);
            hm.put(rem,hm.get(rem)-1);
            if(hm.get(rem)==0)
                hm.remove(rem);
            hm.put(c,hm.getOrDefault(c,0)+1);
            if(check())
                result++;
        }
        return result;
    }
    
    public boolean check()
    {
        for(Map.Entry<Character,Integer> entry : hm.entrySet())
        {
            if(entry.getValue()>1)
                return false;
        }
        return true;
    }
}