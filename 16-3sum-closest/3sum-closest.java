class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            int low = i + 1;
            int high = n - 1;

            while (low < high) {
                int currSum = nums[i] + nums[low] + nums[high];

                if (Math.abs(currSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currSum;
                }

                if (currSum < target) {
                    low++;
                } else if (currSum > target) {
                    high--;
                } else {
                    return currSum;
                }
            }
        }

        return closestSum;
    }
}