class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        int left = 0; int right = 0;
        int max = 0;

        while (right < arr.length) {
            while (set.contains(arr[right])) {
                set.remove(arr[left]);
                left++;
            }

            set.add(arr[right]);
            right++;

            max = Math.max(max, right - left);
        }

        return max;
    }
}