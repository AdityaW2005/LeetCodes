class Solution {
    public int maximumCount(int[] nums) {
        int posCount = 0, negCount = 0;
        for (int i : nums){
            if (i > 0) posCount++;
            else if (i < 0) negCount++;
        }
        return Math.max(posCount, negCount);
    }
}