class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n + 1][amount + 1];

        for (int i = 0; i <= n; i++)
            dp[i][0] = 1;
        
        for (int index = n - 1; index >= 0; index--) {
            for (int target = 1; target <= amount; target++) {
                int take = 0;
                if (coins[index] <= target) 
                    take = dp[index][target - coins[index]];
                int skip = dp[index + 1][target];
                dp[index][target] = take + skip;
            }
        }

        return dp[0][amount];
    }
}