class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        
        while (left < right) {
            int mid = (left + right) >>> 1;  // unsigned right shift to prevent overflow
            
            if (nums[mid] >= target) {
                right = mid;  // search left half including mid
            } else {
                left = mid + 1;  // search right half excluding mid
            }
        }
        
        return left;  // left is the insert position
    }
}
