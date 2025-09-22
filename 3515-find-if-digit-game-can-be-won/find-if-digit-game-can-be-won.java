class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;
        for (int i = 0; i < nums.length; i++){
            String s = Integer.toString(nums[i]);
            if (s.length() % 2 == 1) singleDigitSum += nums[i];
            else doubleDigitSum += nums[i];
        }
        if (singleDigitSum > doubleDigitSum || doubleDigitSum > singleDigitSum) 
            return true;
        return false;
    }
}