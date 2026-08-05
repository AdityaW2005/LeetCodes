class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int color[] = new int[n];
        Arrays.fill(color, -1);

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                color[i] = 0;
                if (!dfs(graph, color, i))
                    return false;
            }
        }

        return true;
    }

    public boolean dfs(int graph[][], int color[], int curr) {
        for (int nei : graph[curr]) {
            if (color[nei] == -1) {
                color[nei] = 1 - color[curr];
                if (!dfs(graph, color, nei))
                    return false;
            }

            else if (color[nei] == color[curr])
                return false;
        }

        return true;
    }
}