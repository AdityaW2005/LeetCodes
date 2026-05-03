class Solution {
    public int uniquePaths(int m, int n) {
        int N = m + n - 2;
        int r = Math.min(m - 1, n - 1);
        double res = 1;

        for (int i = 1; i <= r; i++) 
            res = res * (double) (N - r + i) / i;

        return (int) res;
    }
}