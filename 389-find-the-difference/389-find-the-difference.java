class Solution {
    public char findTheDifference(String s, String t) {
        char[] arr = s.toCharArray();
        for(char c : arr)
        {
            t = t.replaceFirst(Character.toString(c),"0");
        }
        
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)!='0')
                return t.charAt(i);
        }
        return t.charAt(0);
    }
}