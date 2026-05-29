class Solution {
    public int minElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            int digitSum = 0;
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
            list.add(digitSum);
        }

        return Collections.min(list);
    }
}