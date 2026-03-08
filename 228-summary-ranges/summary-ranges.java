class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();

        if (nums.length == 0) {
            return ranges;
        }

        int start = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1] + 1) {

                if (start == nums[i - 1]) {
                    ranges.add(String.valueOf(start));
                } else {
                    ranges.add(start + "->" + nums[i - 1]);
                }

                start = nums[i];
            }
        }

        if (start == nums[nums.length - 1]) {
            ranges.add(String.valueOf(start));
        } else {
            ranges.add(start + "->" + nums[nums.length - 1]);
        }

        return ranges;
    }
}