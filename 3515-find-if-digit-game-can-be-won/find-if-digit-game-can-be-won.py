class Solution:
    def canAliceWin(self, nums: List[int]) -> bool:
        singleDigitSum = 0
        doubleDigit = 0
        for i in nums:
            if len(str(i)) % 2 == 1:
                singleDigitSum += i
            else:
                doubleDigit += i
        if singleDigitSum > doubleDigit or doubleDigit > singleDigitSum:
            return True
        return False