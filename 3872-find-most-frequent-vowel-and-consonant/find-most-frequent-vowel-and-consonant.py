from collections import Counter

class Solution:
    def maxFreqSum(self, s: str) -> int:
        vowels = "aeiou"
        count = Counter(s)
        maxVowel = max((count[c] for c in vowels if c in count), default=0)
        maxConsonant = max((count[c] for c in count if c not in vowels), default=0)
        return maxVowel + maxConsonant
