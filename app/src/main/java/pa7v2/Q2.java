public class Q2 {
    public int numIslands(char[][] grid) {
        //traverse the grid until you find a 1
        //Once there, traverse until upwards and downards you find a zero
        //if zeroes surround it, add to counter
        if (grid.length==0){
            return 0;
        }
        int island_counter = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i ++){
            for (int j = 0; j < n; j++)
                if (grid[i][j]=='1'){
                    island_counter++;
                    dfs(grid,i,j);
                }
        }
        return island_counter;
        
    }
    private void dfs(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;

        // Check for out-of-bounds or if the current cell is water ('0')
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') {
            return;
        }

        // Mark the current cell as visited by changing '1' to '0'
        grid[i][j] = '0';

        // Explore all four directions (up, down, left, right)
        dfs(grid, i - 1, j); // up
        dfs(grid, i + 1, j); // down
        dfs(grid, i, j - 1); // left
        dfs(grid, i, j + 1); // right
    }
    
    
}
