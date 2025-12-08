class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++)
            System.out.print(nums[i] + " ");
        return nums[n - k];
    }
}