class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE;
        int pos = -1;
        int counter = 0;
        for(int[] point : points)
        {
            if(x==point[0] || y==point[1])
            {
                int dist = Math.abs(point[0]-x)+Math.abs(point[1]-y);
                if(dist<min)
                {
                    if(min==dist)
                    {
                        continue;
                    }
                    else
                    {
                        min = dist;
                        pos = counter;
                    }
                }
            }
            counter++;
        }
        return pos;
    }
}