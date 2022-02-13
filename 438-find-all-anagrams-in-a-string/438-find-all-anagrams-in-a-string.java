class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> li = new ArrayList<>();
        char[] parr = p.toCharArray();
        Arrays.sort(parr);
        p = new String(parr);
        for(int i=0;i<=s.length()-p.length();i++)
        {
            String sub = s.substring(i,i+p.length());
            char[] sarr = sub.toCharArray();
            Arrays.sort(sarr);
            sub = new String(sarr);
            if(sub.equals(p))
                li.add(i);
        }
        
        return li;
    }
}