class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        l = []
        for i in nums:
            count = 0
            for j in range(len(nums)):
                if i == nums[j]:
                    count += 1
            l.append(count)
        count = 0
        for i in l:
            if max(l) == i:
                count += 1
        return count