class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String,Boolean> hm = new HashMap<>();
        for(String str: wordDict)
            hm.put(str,true);
        
        for(int i=0;i<s.length();i++)
        {
            String sub = s.substring(0,i+1);
            if(hm.containsKey(sub))
                continue;
            else
            {
                for(int j=0;j<sub.length();j++)
                {
                    String sub1 = sub.substring(0,j+1);
                    String sub2 = sub.substring(j+1);
                    if(hm.containsKey(sub1) && hm.containsKey(sub2))
                    {
                        hm.put(sub,true);
                        break;
                    }
                }
            }
        }
        //System.out.println(hm);
        return hm.getOrDefault(s,false);
    }
}