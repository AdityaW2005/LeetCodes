class Solution {
    public int rob(int[] nums) {
        /*
        int n = nums.length;
        if (n == 2) {
            if (nums[0] > nums[1])
                return nums[0];
            else
                return nums[1];
        };

        if (n == 3) {
            if (nums[0] < nums[1] && nums[2] < nums[1] && nums[0] + nums[2] < nums[1])
                return nums[1];
            else 
                return nums[0] + nums[2];
        }

        int sum = 0;
        for (int i = 0; i < n; i += 2) {
            sum += nums[i];
        }

        return sum;
        */

        int rob = 0;
        int noRob = 0;

        for (int i = 0; i < nums.length; i++) {
            int newRob = noRob + nums[i];
            int newNoRob = Math.max(noRob, rob);
            rob = newRob;
            noRob = newNoRob;
        }
        return Math.max(rob, noRob);
    }
}