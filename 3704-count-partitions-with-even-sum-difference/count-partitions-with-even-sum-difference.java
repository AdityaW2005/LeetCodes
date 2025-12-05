class Solution {
    public int countPartitions(int[] nums) {
        // Brute - Force Solution

        /*
        int n = nums.length;
        int count = 0;
        int[] totalDiff = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            int sumValue1 = 0;
            int sumValue2 = 0;

            for (int l = 0; l <= i; l++) {
                sumValue1 += nums[l];
            }
            for (int r = i + 1; r < n; r++) {
                sumValue2 += nums[r];
            }

            totalDiff[i] = sumValue1 - sumValue2;
        }

        for (int diff : totalDiff) {
            if (diff % 2 == 0) {
                count++;
            }
        }

        return count;
        */

        // Optimized Solution

        int total = 0;
        for (int i : nums)
            total += i;
        if (total % 2 != 0)
            return 0;
        return nums.length - 1;
    }
}
