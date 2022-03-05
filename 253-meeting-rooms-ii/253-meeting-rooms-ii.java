class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]);
        List<Integer> li = new ArrayList<>();
        for(int[] interval : intervals)
        {
            int flag = 1;
            for(int i=0;i<li.size();i++)
            {
                if(li.get(i)<=interval[0])
                {
                    flag = 0;
                    li.set(i,interval[1]);
                    break;
                }
            }
            if(flag==1)
                li.add(interval[1]);
        }
        return li.size();
    }
}