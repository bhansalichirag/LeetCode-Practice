class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int counter = 0;
        while(true)
        {
            char c = ' ';
            if(counter<strs[0].length())
                c = strs[0].charAt(counter);
            else
                return result;
            for(int i=1;i<strs.length;i++)
            {
                if(counter<strs[i].length() && c==strs[i].charAt(counter))
                    continue;
                else
                    return result;
            }
            counter++;
            result+= Character.toString(c);
        }
    }
}