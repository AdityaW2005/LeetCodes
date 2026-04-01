class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    traverseIsland(grid, i, j); 
                }
            }
        }
        return count;
    }

    public void traverseIsland(char grid[][], int i, int j) {
        int m = grid.length;
        int n = grid[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == '0')
            return;
        
        grid[i][j] = '0';
        traverseIsland(grid, i, j + 1); // right
        traverseIsland(grid, i + 1, j); // down
        traverseIsland(grid, i, j - 1); // left
        traverseIsland(grid, i - 1, j);     // up
    }
}