class Solution {
    public int averageValue(int[] nums) {
        int sum = 0; int count = 0;
        
        for (int i : nums) {
            if (i % 6 == 0) {
                sum += i;
                count++;
            }
        }

        if (count == 0)
            return 0;
        
        return sum / count;
    }
}