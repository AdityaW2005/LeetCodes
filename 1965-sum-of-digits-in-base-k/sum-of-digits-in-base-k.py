class Solution:
    def sumBase(self, n: int, k: int) -> int:
        baseKDigitSum = 0
        while n > 0:
            baseKDigitSum += n % k
            n //= k
            
        return baseKDigitSum