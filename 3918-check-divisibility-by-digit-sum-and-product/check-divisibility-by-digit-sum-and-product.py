class Solution:
    def checkDivisibility(self, n: int) -> bool:
        x = n
        digitSum = 0
        prod = 1
        while x > 0:
            digit = x % 10
            digitSum += digit
            prod *= digit
            x //= 10
        return n % (digitSum + prod) == 0