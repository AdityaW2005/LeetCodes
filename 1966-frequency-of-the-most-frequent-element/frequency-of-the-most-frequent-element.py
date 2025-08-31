class Solution:
    def maxFrequency(self, nums: list[int], k: int) -> int:
        nums.sort()
        l = 0
        total = 0
        ans = 0

        for r, val in enumerate(nums):
            total += val
            # Check if current window [l..r] is valid
            while total + k < val * (r - l + 1):
                total -= nums[l]
                l += 1
            ans = max(ans, r - l + 1)

        return ans
