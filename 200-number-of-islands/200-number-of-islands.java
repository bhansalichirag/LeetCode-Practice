class Solution {
    int[][] visited;
    int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
    public int numIslands(char[][] grid) {
        int counter = 0;
        visited = new int[grid.length][];
        for(int i=0;i<grid.length;i++)
        {
            visited[i] = new int[grid[i].length];
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]=='1' && visited[i][j]==0)
                {
                    visited[i][j] = 1;
                    fillup(grid,i,j);
                    counter++;
                }
            }
        }
        return counter;
    }
    
    public void fillup(char[][] grid,int x,int y)
    {
        if(x<0 || x>visited.length || y<0 || y>visited[0].length)
        {
            return;   
        }
        for(int i=0;i<directions.length;i++)
        {
            int xtemp = x+directions[i][0];
            int ytemp = y+directions[i][1];
            if(xtemp>=0 && xtemp<grid.length && ytemp>=0 && ytemp<grid[0].length && visited[xtemp][ytemp]==0 && grid[xtemp][ytemp]=='1')
            {
                
                visited[xtemp][ytemp]=1;
                fillup(grid,xtemp,ytemp);
            }
        }
    }
}