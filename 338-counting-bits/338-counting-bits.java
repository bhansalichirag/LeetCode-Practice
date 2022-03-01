class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        for(int i=1;i<=n;i++)
        {
            String str = Integer.toBinaryString(i);
            int counter = 0;
            char[] temp = str.toCharArray();
            for(char c : temp)
            {
                if(c=='1')
                    counter++;
            }
            arr[i] = counter;
        }
        return arr;
    }
}