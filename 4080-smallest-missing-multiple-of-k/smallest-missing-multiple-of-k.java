class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int minVal = k;
        for (int num : nums) {
            set.add(num);
        }

        for (int i = k; i <= 1000; i = i + k) {
            if (!set.contains(i)) {
                minVal = i;
                break;
            }
        }

        return minVal;
    }
}