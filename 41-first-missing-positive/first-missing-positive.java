class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int ex = 1;

        for (int i : nums) {
            if (i == ex)
                ex++;
        }

        return ex;
    }
}