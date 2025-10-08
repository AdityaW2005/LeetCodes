class Solution:
    def sumBase(self, n: int, k: int) -> int:
        baseK = ""
        while n > 0:
            baseK = str(n % k) + baseK
            n //= k
        
        value = int(baseK)
        digitSum = 0
        while value > 0:
            digitSum += value % 10
            value //= 10
        
        return digitSum