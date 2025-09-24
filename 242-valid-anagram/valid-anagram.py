class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        count = 0
        chars = list(s) 
        for i in t:
            if i in chars:
                count += 1
                chars.remove(i) 
            else:
                return False  
        return count == len(t)