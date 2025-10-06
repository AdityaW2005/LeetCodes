class Solution:
    def convertToBase7(self, num: int) -> str:
        if num == 0:
            return "0"
        neg = num < 0
        n = abs(num)
        res = ""
        while n > 0:
            res = str(n % 7) + res
            n //= 7
        return "-" + res if neg else res
