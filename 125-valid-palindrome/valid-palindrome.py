class Solution:
    def isPalindrome(self, s: str) -> bool:
        l = []

        for i in s:
            if i.isalpha():
                l.append(i.lower())
            elif i.isdigit():
                l.append(i)
            else:
                pass
        
        i, j = 0, len(l) - 1

        while i < j:
            if l[i] == l[j]:
                i += 1
                j -= 1
            else:
                return False

        return True