class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();

        for (int num : nums1) {
            list.add(num);
        }

        for (int num : nums2) {
            list.add(num);
        }

        Collections.sort(list);

        double median;

        if (list.size() % 2 == 0) {
            int mid1 = list.size() / 2 - 1;
            int mid2 = list.size() / 2;

            median = (list.get(mid1) + list.get(mid2)) / 2.0;
        } else {
            int mid = list.size() / 2;

            median = list.get(mid);
        }

        return median;
    }
}