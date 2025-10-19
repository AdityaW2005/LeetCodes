import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        List<Integer> freqList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            freqList.add(count);
        }

        int maxFreq = Collections.max(freqList);
        int count = 0;
        for (int freq : freqList) {
            if (freq == maxFreq) {
                count++;
            }
        }
        return count;
    }
}
