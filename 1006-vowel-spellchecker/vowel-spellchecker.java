import java.util.*;

class Solution {
    private static final String VOWELS = "aeiou";

    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> words = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> caseInsensitive = new HashMap<>();
        Map<String, String> vowelMasked = new HashMap<>();

        for (String word : wordlist) {
            String lower = word.toLowerCase();
            caseInsensitive.putIfAbsent(lower, word);
            String mask = devowel(lower);
            vowelMasked.putIfAbsent(mask, word);
        }

        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            if (words.contains(query)) { // Exact match
                result[i] = query;
            } else {
                String lower = query.toLowerCase();
                if (caseInsensitive.containsKey(lower)) { // Case-insensitive match
                    result[i] = caseInsensitive.get(lower);
                } else {
                    String mask = devowel(lower);
                    if (vowelMasked.containsKey(mask)) { // Vowel error match
                        result[i] = vowelMasked.get(mask);
                    } else {
                        result[i] = ""; // No match
                    }
                }
            }
        }
        return result;
    }

    private String devowel(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (VOWELS.indexOf(c) >= 0)
                sb.append('*');
            else
                sb.append(c);
        }
        return sb.toString();
    }
}
