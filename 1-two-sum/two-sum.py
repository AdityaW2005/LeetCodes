class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        hashMap = {}

        for i in range(len(nums)):
            y = target - nums[i]

            if y in hashMap:
                return [hashMap[y], i]

            hashMap[nums[i]] = i
