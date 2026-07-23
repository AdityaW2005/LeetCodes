class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n][amount + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        
        return helper(0, amount, coins, dp);
    }

    public int helper(int index, int target, int[] coins, int dp[][]) {
        if (target == 0)
            return 1;
        if (index == coins.length)
            return 0;
        if (dp[index][target] != -1)
            return dp[index][target];
        
        int take = 0;
        if (coins[index] <= target)
            take = helper(index, target - coins[index], coins, dp);
        int skip = helper(index + 1, target, coins, dp);

        return dp[index][target] = take + skip;
    }
}