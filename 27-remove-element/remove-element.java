class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0; // Pointer for placement of non-val elements
        for (int num : nums) {
            if (num != val) {
                nums[i] = num;
                i++;
            }
        }
        return i; // New length of array without val elements
    }
}
