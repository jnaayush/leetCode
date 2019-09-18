class Solution {
    public int numIslands(char[][] grid) {
        int numIslands = 0;
        Queue<int[]> q = new LinkedList<>();   
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    numIslands += 1;
                    grid[i][j] = '0';
                    q.add(new int[]{i,j});
                    while(!q.isEmpty()){
                        int[] cur = q.poll();
                        int l = cur[0];
                        int r = cur[1];
                        if(l-1 >= 0 && grid[l-1][r] == '1'){
                            grid[l-1][r] = '0';
                            q.add(new int[]{l-1,r});
                        }
                        if(l+1 < grid.length && grid[l+1][r] == '1'){
                            grid[l+1][r] = '0';
                            q.add(new int[]{l+1,r});
                        }
                        if(r-1 >= 0 && grid[l][r-1] == '1'){
                            grid[l][r-1] = '0';
                            q.add(new int[]{l,r-1});
                        }
                        if(r+1 < grid[0].length && grid[l][r+1] == '1'){
                            grid[l][r+1] = '0';
                            q.add(new int[]{l,r+1});
                        }
                    }
                }
            }
        }
        return numIslands;    
    }
}
