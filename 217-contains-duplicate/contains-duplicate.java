import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        return nums.length != new HashSet<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new))).size();
    }
}
