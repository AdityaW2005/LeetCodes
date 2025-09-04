class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        a = s.rstrip().split(' ')
        return len(a[-1])