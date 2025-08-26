# Brute Force Method
# class Solution:
#     def check(self, nums: List[int]) -> bool:
#         for i in range(len(nums)):
#             a = nums.pop(0)
#             nums.append(a)
#             if nums == sorted(nums):
#                 return True
#         return False

# Optimized Solution
class Solution:
    def check(self, nums: List[int]) -> bool:
        N = len(nums)
        count = 1
        for i in range(1, 2 * N):
            if nums[(i - 1) % N] <= nums[i % N]:
                count += 1
            else:
                count = 1
            if count == N:
                return True
        return N == 1