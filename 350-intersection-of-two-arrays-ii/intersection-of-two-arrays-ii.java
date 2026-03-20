class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums1) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (count.getOrDefault(num, 0) > 0) {
                result.add(num);
                count.put(num, count.get(num) - 1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}