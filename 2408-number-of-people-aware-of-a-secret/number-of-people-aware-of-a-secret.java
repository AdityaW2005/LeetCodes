class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = 1_000_000_007;

        long[] dp = new long[n + 1];
        dp[1] = 1;
        
        long sharing = 0;
        
        for (int i = 2; i <= n; i++) {
            if (i - delay >= 0) {
                sharing = (sharing + dp[i - delay]) % MOD;
            }
            
            if (i - forget >= 0) {
                sharing = (sharing - dp[i - forget] + MOD) % MOD;
            }
            
            dp[i] = sharing;
        }
        
        long totalAware = 0;
        for (int i = n - forget + 1; i <= n; i++) {
            totalAware = (totalAware + dp[i]) % MOD;
        }
        
        return (int) totalAware;
    }
}
