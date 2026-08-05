class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++)
            adj.add(new ArrayList<>());
        
        int indegree[] = new int[numCourses];
        int topoSort[] = new int[numCourses];
        int index = 0;

        for (int edge[] : prerequisites) {
            int course = edge[0];
            int prerequisite = edge[1];
            adj.get(prerequisite).add(course);
            indegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0)
                queue.add(i);
        }

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            topoSort[index++] = curr;

            for (int neighbor : adj.get(curr)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0)
                    queue.add(neighbor);
            }
        }

        return index == numCourses ? topoSort : new int[]{};
    }
}