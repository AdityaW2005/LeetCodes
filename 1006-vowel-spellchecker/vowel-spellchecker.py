import re
from collections import defaultdict
from typing import List

class Solution:
    def spellchecker(self, wordlist: List[str], queries: List[str]) -> List[str]:
        def devowel(word):
            return re.sub(r'[aeiou]', '*', word.lower())
        
        # Sets and dictionaries
        original_words = set(wordlist)
        lowercase_map = dict()
        vowel_map = dict()
        
        # Store first occurrence only for maps
        for word in wordlist:
            lower = word.lower()
            mask = devowel(word)
            if lower not in lowercase_map:
                lowercase_map[lower] = word
            if mask not in vowel_map:
                vowel_map[mask] = word
        
        result = []
        for query in queries:
            if query in original_words:  # Rule 1
                result.append(query)
                continue
            lower_query = query.lower()
            if lower_query in lowercase_map:  # Rule 2
                result.append(lowercase_map[lower_query])
                continue
            mask_query = devowel(query)  # Rule 3
            if mask_query in vowel_map:
                result.append(vowel_map[mask_query])
                continue
            result.append("")  # No match
        return result

