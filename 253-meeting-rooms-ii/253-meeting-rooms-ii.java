class Solution {
    List<Integer> end_time = new ArrayList<>();
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]);
        
        for(int[] arr : intervals)
        {
            //System.out.println(Arrays.toString(arr));
            int end = arr[1];
            int flag = 1;
            int room = 0;
            for(int i=0;i<end_time.size();i++)
            {
                if(end_time.get(i)<=arr[0])
                {
                    flag = 0;
                    room = i;
                    break;
                }
            }
            if(flag==0)
            {
                end_time.set(room,end);
            }
            else if(flag==1)
            {
                end_time.add(end);
            }
           // System.out.println("ancdef"+end_time);
        }
        return end_time.size();
    }
}