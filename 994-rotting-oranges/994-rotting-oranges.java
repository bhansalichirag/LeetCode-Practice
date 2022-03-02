class Solution {
    int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
    List<int[]> rotten = new ArrayList<>();
    public int orangesRotting(int[][] grid) {
        int fresh = getFresh(grid);
        //System.out.println(rotten.size()+"  "+fresh);
        if(fresh==0)
            return 0;
        int prevfresh = 0;
        int minutes = 0;
        while(prevfresh!=fresh)
        {
            prevfresh = fresh;
            minutes++;
            grid = changeValues(grid);
            fresh = getFresh(grid);
            if(fresh==0)
                return minutes;
        }
        return -1;
    }
    
    public int getFresh(int[][] grid)
    {
        int fresh = 0;
        rotten = new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                    fresh++;
                else if(grid[i][j]==2)
                    rotten.add(new int[]{i,j});
            }
        }
        return fresh;
    }
    
    public int[][] changeValues(int[][] grid)
    {
        for(int[] arr : rotten)
        {
            for(int i=0;i<directions.length;i++)
            {
                int x = arr[0]+directions[i][0];
                int y = arr[1]+directions[i][1];
                if(x>=0 && x<grid.length && y>=0 && y<grid[0].length && grid[x][y]==1)
                {
                    grid[x][y] = 2;
                }
            }
        }
        return grid;
    }
}