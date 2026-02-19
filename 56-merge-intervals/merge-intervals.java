class Solution {
    public int[][] merge(int[][] intervals) {        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> merged = new ArrayList<>();
        
        merged.add(intervals[0]);
        
        for (int i = 1; i < intervals.length; i++) {
            int[] prev = merged.get(merged.size() - 1);
            int[] curr = intervals[i];
            
            if (prev[1] >= curr[0]) {
                prev[1] = Math.max(prev[1], curr[1]);
            } else {
                merged.add(curr);
            }
        }
        
        return merged.toArray(new int[merged.size()][]);
    }
}
