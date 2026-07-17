class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        long reach = 0;
        int count = 0;
        int i = 0;

        while (reach < target) {
            if (i < coins.length && coins[i] <= reach + 1) {
                reach += coins[i];
                i++;
            }

            else {
                reach = 2 * reach + 1;
                count++;
            }
        }

        return count;
    }
}