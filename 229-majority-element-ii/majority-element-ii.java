class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0, c2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (c1 == 0 && nums[i] != el2) {
                c1 = 1;
                el1 = nums[i];
            }

            else if (c2 == 0 && nums[i] != el1) {
                c2 = 1;
                el2 = nums[i];
            }

            else if (el1 == nums[i]) c1++;
            else if (el2 == nums[i]) c2++;

            else {
                c1--;
                c2--;
            }
        }

        List<Integer> res = new ArrayList<>();
        c1 = 0; c2 = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (el1 == nums[i]) c1++;
            if (el2 == nums[i]) c2++;
        }

        int mini = (int) nums.length / 3 + 1;
        if (c1 >= mini) res.add(el1);
        if (c2 >= mini) res.add(el2);

        return res;
    }
}