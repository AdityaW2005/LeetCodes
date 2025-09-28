class Solution:
    def alternateDigitSum(self, n: int) -> int:
        oddIndexSum = 0
        evenIndexSum = 0
        a = str(n)
        for i in a[0 :: 2]:
            evenIndexSum += int(i)
        for i in a[1 :: 2]:
            oddIndexSum += int(i)
        print(oddIndexSum, evenIndexSum)
        return evenIndexSum - oddIndexSum 