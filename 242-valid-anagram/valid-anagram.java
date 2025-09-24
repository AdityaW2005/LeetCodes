import java.util.HashMap;
import java.util.Map;
class Solution {
    public boolean isAnagram(String s, String t) {
        // if (s.length() != t.length()) {
        //     return false;
        // }
        
        // int[] charCount = new int[26]; // For lowercase English letters
        
        // // Process both strings simultaneously
        // for (int i = 0; i < s.length(); i++) {
        //     charCount[s.charAt(i) - 'a']++;
        //     charCount[t.charAt(i) - 'a']--;
        // }
        
        // // Check if all counts are zero
        // for (int count : charCount) {
        //     if (count != 0) {
        //         return false;
        //     }
        // }
        
        // return true;

        if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count characters in string s
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Decrement counts using string t
        for (char c : t.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) - 1);
            if (charCount.get(c) < 0) {
                return false;
            }
        }
        
        return true;
    }
}




        