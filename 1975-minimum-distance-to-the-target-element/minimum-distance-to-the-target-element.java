class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minDist = Integer.MAX_VALUE;
        
        for (int right = nums.length - 1; right >= 0; right--) {
            if (nums[right] == target) 
                minDist = Math.min(minDist, Math.abs(right - start));
        }

        return minDist;
    }
}