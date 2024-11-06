public class Q3 {
    public int maxAreaOfIsland(int[][] grid) {
        //traverse the grid until you find a 1
        //Once there, traverse until upwards and downards you find a zero
        //if zeroes surround it, add to counter
        if (grid.length==0){
            return 0;
        }
        int island_counter = 0;
        int m = grid.length;
        int n = grid[0].length;
        int max_island = 0;
        for (int i = 0; i < m; i ++){
            for (int j = 0; j < n; j++){
                if (grid[i][j]==1){
                    int island_size = dfs(grid,i,j);
                    max_island = MaxCheck(max_island,island_size);
                }
        }  
    }
    return max_island;
    }

    private int dfs(int[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        int size = 1;

        // Check for out-of-bounds or if the current cell is water ('0')
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
            return 0;
        }

        // Mark the current cell as visited by changing '1' to '0'
        grid[i][j] = 0;

        // Explore all four directions up, down, left, right
        size += dfs(grid, i - 1, j); // up
        size += dfs(grid, i + 1, j); // down
        size += dfs(grid, i, j - 1); // left
        size += dfs(grid, i, j + 1); // right

        return size;
    }

    private int MaxCheck(int a, int b) {
        return (a > b) ? a : b;  
    }
    
}
