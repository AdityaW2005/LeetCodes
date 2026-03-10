class Solution:
    def maximumProduct(self, nums: List[int]) -> int:
        nums.sort(reverse = True)

        prod1 = nums[0] * nums[1] * nums[2]
        prod2 = nums[0] * nums[-1] * nums[-2]

        return max(prod1, prod2)