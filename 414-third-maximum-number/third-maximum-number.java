import java.util.Set;
import java.util.HashSet;

class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() <= 2) {
            int max = Integer.MIN_VALUE;
            for (int num : set) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        } else {
            for (int i = 0; i < 2; i++) {
                int max = Integer.MIN_VALUE;
                for (int num : set) {
                    if (num > max) {
                        max = num;
                    }
                }
                set.remove(max);
            }
            int max = Integer.MIN_VALUE;
            for (int num : set) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }
    }
}
