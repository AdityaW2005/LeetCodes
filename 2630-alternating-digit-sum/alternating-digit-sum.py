class Solution:
    def alternateDigitSum(self, n: int) -> int:
        ans = 0
        for i in range(len(str(n))):
            ans += int(str(n)[i]) * (-1) ** i
        return ans