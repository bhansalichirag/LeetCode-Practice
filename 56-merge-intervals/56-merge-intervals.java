class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int[]> li = new ArrayList<>();
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]>=start && intervals[i][0]<=end)
            {
                end = Math.max(intervals[i][1],end);
            }
            else
            {
                int[] arr = new int[2];
                arr[0] = start;
                arr[1] = end;
                li.add(arr);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        int[] arr = new int[2];
        arr[0] = start;
        arr[1] = end;
        li.add(arr);
        
        int[][] result = new int[li.size()][];
        int counter = 0;
        for(int[] a : li)
        {
            result[counter] = new int[2];
            result[counter][0] = a[0];
            result[counter][1] = a[1];
            counter++;
        }
        return result;
    }
}