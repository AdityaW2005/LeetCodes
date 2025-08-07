class Solution:
    def reverse(self, x: int) -> int:
        revNum = 0
        intMax = 2**31 - 1
        intMin = -2**31

        isNegative = x < 0
        x = abs(x)

        while x > 0:
            lastDigit = x % 10
            x = x // 10
            revNum = revNum * 10 + lastDigit

        if isNegative:
            revNum = -revNum

        # Check overflow after reversing
        if revNum < intMin or revNum > intMax:
            return 0

        return revNum
