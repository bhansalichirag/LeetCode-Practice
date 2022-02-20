class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> b[1]==a[1] ? a[0]-b[0] : b[1]-a[1]);
        int start = Integer.MIN_VALUE;
        int end = Integer.MIN_VALUE;
        int rem = 0;
        for(int i=0;i<intervals.length;i++)
        {
            if(intervals[i][0]>=start && intervals[i][1]<=end)
                continue;
            else
            {
                rem++;
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        return rem;
    }
}