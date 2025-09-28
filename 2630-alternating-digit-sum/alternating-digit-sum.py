class Solution:
    def alternateDigitSum(self, n: int) -> int:
        oddIndexSum = 0
        evenIndexSum = 0
        for i in str(n)[0 :: 2]:
            evenIndexSum += int(i)
        for i in str(n)[1 :: 2]:
            oddIndexSum += int(i)
        return evenIndexSum - oddIndexSum

        # Other Way of Approach

        # ans = 0
        # for i, c in enumerate(str(n)):
        #     ans += int(c) * (-1) ** i
        # return ans