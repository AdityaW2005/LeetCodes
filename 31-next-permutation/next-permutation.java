class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                pivot = i - 1;
                break;
            }
        }

        if (pivot == -1) {
            Arrays.sort(nums);
            return;
        }

        int swap_index = pivot + 1;

        for (int i = pivot + 1; i < n; i++) {
            if (nums[i] > nums[pivot] && nums[i] <= nums[swap_index])
                swap_index = i;
        }

        int temp = nums[pivot];
        nums[pivot] = nums[swap_index];
        nums[swap_index] = temp;

        Arrays.sort(nums, pivot + 1, n);
    }
}