class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 1; 
        int longest = 1;

        if (nums.length == 0) return 0;

        int lastSmallest = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] == lastSmallest + 1) {
                count++;
                lastSmallest = nums[i];
            }

            else if (nums[i] != lastSmallest) {
                count = 1;
                lastSmallest = nums[i];
            }

            longest = Math.max(count, longest);
        }
        return longest;
    }
}
