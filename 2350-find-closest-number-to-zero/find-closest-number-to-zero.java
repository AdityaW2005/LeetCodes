class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for (int num : nums) {
            if (Math.abs(num) < Math.abs(closest)) {
                closest = num;
            } 
            else if (Math.abs(num) == Math.abs(closest) && num > closest) {
                closest = num;
            }
        }

        return closest;
    }
}