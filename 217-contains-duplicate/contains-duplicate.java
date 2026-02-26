class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Basic Approach
        /*
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums){
            set.add(i);
        }

        return set.size() != nums.length;
        */

        // Early Exit Optimization
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums){
            if (!set.add(i))
                return true;
        }
        return false;
    }
}