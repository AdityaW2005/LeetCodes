import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Set<Character> chars = new HashSet<>();
        Set<String> uniqWords = new HashSet<>();
        Set<Map.Entry<Character, String>> pairs = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            char ch = pattern.charAt(i);
            String w = words[i];
            chars.add(ch);
            uniqWords.add(w);
            pairs.add(new AbstractMap.SimpleEntry<>(ch, w));
        }

        return chars.size() == uniqWords.size() && uniqWords.size() == pairs.size();
    }
}
