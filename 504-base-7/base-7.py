class Solution:
    def convertToBase7(self, num: int) -> str:
        if num == 0:
            return "0"
        neg = num < 0
        n = abs(num)
        a = ""
        while n > 0:
            a = str(n % 7) + a
            n //= 7
        return "-" + a if neg else a
