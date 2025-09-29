class Solution:
    def getLeastFrequentDigit(self, n: int) -> int:
        freq = dict()
        s = str(n)
        for i in s:
            freq[i] = s.count(i)
        ones = [d for d, c in freq.items() if c == 1]
        if len(ones) > 2:
            return min(int(d) for d in ones)
        min_freq = min(freq.values())
        candidates = [int(d) for d, c in freq.items() if c == min_freq]
        return min(candidates)