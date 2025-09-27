class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int x : nums) {
            elementSum += x;
            int n = x;
            while (n > 0) {
                digitSum += n % 10;
                n /= 10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}
