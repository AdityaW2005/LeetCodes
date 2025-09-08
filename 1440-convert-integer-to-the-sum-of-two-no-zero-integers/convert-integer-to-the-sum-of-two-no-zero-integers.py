# class Solution:
#     def getNoZeroIntegers(self, n: int) -> List[int]:
#         def has_zero(num: int) -> bool:
#             return '0' in str(num)
#         for a in range(1, n):
#             b = n - a
#             if not has_zero(a) and not has_zero(b):
#                 return [a, b]

from typing import List

class Solution:
    def getNoZeroIntegers(self, n: int) -> List[int]:
        a = 0
        b = 0
        power_of_10 = 1
        
        while n > 0:
            digit = n % 10
            n = n // 10

            if (digit == 0 or digit == 1) and n > 0:
                a += 2 * power_of_10
                b += (digit + 8) * power_of_10
                n -= 1
            else:
                a += 1 * power_of_10
                b += (digit - 1) * power_of_10
            
            power_of_10 *= 10
            
        return [a, b]
