class Solution:
    def alternateDigitSum(self, n: int) -> int:
        # ans = 0
        # for i, c in enumerate(str(n)):
        #     ans += int(c) * (-1) ** i
        # return ans

        alternateDigitSum = 0
        for i in range(len(str(n))):
            alternateDigitSum += int(str(n)[i]) * (-1) ** i
        return alternateDigitSum