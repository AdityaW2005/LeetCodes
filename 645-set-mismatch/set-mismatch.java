class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate = -1, missing = -1;

        for (int num : nums) {
            int index = Math.abs(num) - 1;

            if (nums[index] < 0)
                duplicate = Math.abs(num);
            else 
                nums[index] *= -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}