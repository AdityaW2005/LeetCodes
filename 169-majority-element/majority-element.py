class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n = len(nums)
        element = 0
        count = 0
        for i in range(n):
            if count == 0:
                element = nums[i]
                count = 1
            elif element == nums[i]:
                count += 1
            else:
                count -= 1
        count1 = 0
        for i in range(n):
            if nums[i] == element:
                count1 += 1
        if count1 > (n // 2):
            return element
        else:
            return -1