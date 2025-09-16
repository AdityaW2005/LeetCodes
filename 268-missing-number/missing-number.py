class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        l = []
        for i in range(len(nums)+1):
            l.append(i)
        for i in l:
            if i not in nums:
                return i
                break