class Solution:
    def canAliceWin(self, nums: List[int]) -> bool:
        singleDigitSum = 0
        doubleDigitSum = 0
        for i in nums:
            if len(str(i)) % 2 == 1:
                singleDigitSum += i
            else:
                doubleDigitSum += i
        if singleDigitSum > doubleDigitSum or doubleDigitSum > singleDigitSum:
            return True
        return False