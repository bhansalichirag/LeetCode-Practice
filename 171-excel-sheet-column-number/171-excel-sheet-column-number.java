class Solution {
    public int titleToNumber(String columnTitle) {
        int val = 0;
        for(int i=columnTitle.length()-1;i>=0;i--)
        {
            int temp = columnTitle.charAt(i) - 'A' + 1;
            val+= temp * Math.pow(26,columnTitle.length()-1-i);
        }
        return val;
    }
}