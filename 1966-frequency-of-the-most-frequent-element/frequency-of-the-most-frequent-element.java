import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long total = 0;
        int ans = 0, l = 0;

        for (int r = 0; r < nums.length; r++) {
            total += nums[r];
            while (total + k < (long) nums[r] * (r - l + 1)) {
                total -= nums[l++];
            }
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}
