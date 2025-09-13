import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFreqSum(String s) {
        String vowels = "aeiou";
        Map<Character, Integer> count = new HashMap<>();
        
        // Count frequency of each character
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        int maxVowel = 0;
        int maxConsonant = 0;
        
        // Find max vowel frequency
        for (char c : vowels.toCharArray()) {
            if (count.containsKey(c)) {
                maxVowel = Math.max(maxVowel, count.get(c));
            }
        }
        
        // Find max consonant frequency
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            char c = entry.getKey();
            if (vowels.indexOf(c) == -1) { // not a vowel
                maxConsonant = Math.max(maxConsonant, entry.getValue());
            }
        }
        
        return maxVowel + maxConsonant;
    }
}
