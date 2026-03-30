class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        pivot = -1

        for i in range(n - 1, 0, -1):
            if (nums[i] > nums[i - 1]):
                pivot = i - 1
                break
        
        if pivot == -1:
            nums.sort()

        swap_index = pivot + 1
        for j in range(swap_index, n):
            if (nums[j] > nums[pivot] and nums[j] <= nums[swap_index]):
                swap_index = j

        nums[pivot], nums[swap_index] = nums[swap_index], nums[pivot]

        nums[pivot + 1:] = sorted(nums[pivot + 1:])

