class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int left = 0;
        int minVal = Integer.MAX_VALUE;
        
        for (int right = nums.length - 1; right >= 0; right--) {
            if (nums[right] == target) {
                minVal = Math.min(minVal, Math.abs(right - start));
            }
        }

        return minVal;
    }
}