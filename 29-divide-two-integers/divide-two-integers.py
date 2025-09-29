class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if (dividend == -2147483648 and divisor == -1) or (dividend == -2147483648 and divisor == -1):
            return 2147483647
        if (dividend > 0 and divisor > 0) or (dividend < 0 and divisor < 0):
            return math.floor(dividend / divisor)
        if (dividend > 0 and divisor < 0) or (dividend < 0 and divisor > 0):
            return math.ceil(dividend / divisor)
        if dividend == divisor == -1:
            return 1
        if dividend == 0:
            return 0
        
        
        