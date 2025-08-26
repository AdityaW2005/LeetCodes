class Solution:
    def check(self, nums: List[int]) -> bool:
        for i in range(len(nums)):
            a = nums.pop(0)
            nums.append(a)
            if nums == sorted(nums):
                return True
        return False