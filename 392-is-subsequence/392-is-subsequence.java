class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length())
            return false;
        int starts = 0;
        int startt = 0;
        while(starts<s.length() && startt<t.length())
        {
            char cs = s.charAt(starts);
            char ct = t.charAt(startt);
            if(cs==ct)
            {
                starts++;
                startt++;
            }
            else
                startt++;
        }
        return starts == s.length();
    }
}