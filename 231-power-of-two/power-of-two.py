class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        if n <= 0:
            return False
        nBit = bin(n)
        return nBit.count('1') == 1
       