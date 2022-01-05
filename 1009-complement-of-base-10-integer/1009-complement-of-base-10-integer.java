class Solution {
    public int bitwiseComplement(int n) {
        String str = Integer.toBinaryString(n);
        String str1 = "";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='0')
                str1+="1";
            else
                str1+="0";
        }
        return Integer.parseInt(str1,2);
    }
}