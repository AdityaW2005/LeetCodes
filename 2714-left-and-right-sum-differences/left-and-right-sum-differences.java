class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];

        for (int i = 0; i < n; i++) {
            int leftSum = 0, rightSum = 0;

            for (int j = 0; j <= i - 1; j++)
                leftSum += nums[j];

            for (int j = i + 1; j <= n - 1; j++) 
                rightSum += nums[j];
            
            result[i] = Math.abs(leftSum - rightSum);
        }

        return result;
    }
}