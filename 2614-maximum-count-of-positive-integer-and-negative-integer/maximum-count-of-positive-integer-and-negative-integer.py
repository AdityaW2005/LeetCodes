class Solution:
    def maximumCount(self, nums: List[int]) -> int:
        posCount = 0
        negCount = 0
        for i in nums:
            if i > 0:
                posCount += 1
            elif i < 0:
                negCount += 1
        return max(posCount, negCount)