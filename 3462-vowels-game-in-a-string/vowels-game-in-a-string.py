class Solution:
    def doesAliceWin(self, s: str) -> bool:
        vowels = set("aeiou")
        for v in s:
            if v in vowels:
                return True
        return False