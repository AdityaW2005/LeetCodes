class Solution {
    public String sortVowels(String s) {
        String vowelsStr = "AEIOUaeiou";
        List<Character> vowels = new ArrayList<>();
        char[] arr = s.toCharArray();

        // Extract vowels
        for (char c : arr) {
            if (vowelsStr.indexOf(c) != -1) {
                vowels.add(c);
            }
        }

        // Sort vowels by ASCII value
        Collections.sort(vowels);

        // Replace vowels in original positions with sorted
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (vowelsStr.indexOf(arr[i]) != -1) {
                arr[i] = vowels.get(idx++);
            }
        }
        return new String(arr);
    }
}
