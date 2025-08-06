class Solution:
    def isPalindrome(self, x: int) -> bool:
        if (x >= 0):
            a = str(x)
            return a == a[::-1]
        else:
            return False