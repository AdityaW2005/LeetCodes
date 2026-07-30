class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length; 
        int n = grid[0].length;
        int count = 0;

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == '1') {
                    count++;
                    dfsIsland(grid, row, col);
                }
            }
        }

        return count;
    }

    public void dfsIsland(char[][] grid, int row, int col) {
        int m = grid.length;
        int n = grid[0].length;
        
        if (row < 0 || col < 0 || row >= m || col >= n || grid[row][col] == '0')
            return;
        
        grid[row][col] = '0';
        dfsIsland(grid, row, col + 1);
        dfsIsland(grid, row - 1, col);
        dfsIsland(grid, row, col - 1);
        dfsIsland(grid, row + 1, col);
    }
}