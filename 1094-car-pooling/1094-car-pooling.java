class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] arr = new int[1001];
        //Arrays.sort(trips,(a,b)->a[1]-b[1]);
        for(int i=0;i<trips.length;i++)
        {
            for(int j=trips[i][1];j<trips[i][2];j++)
            {
                arr[j]+=trips[i][0];
                if(arr[j]>capacity)
                    return false;
            }
        }
        return true;
    }
}