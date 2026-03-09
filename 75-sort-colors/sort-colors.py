class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        count_zero = 0
        count_one = 0
        count_two = 0

        for i in nums:
            if i == 0:
                count_zero += 1
            elif i == 1:
                count_one += 1
            else:
                count_two += 1
        
        for i in range(count_zero):
            nums[i] = 0

        for i in range(count_zero, count_zero + count_one):
            nums[i] = 1

        for i in range(count_zero + count_one, count_zero + count_one + count_two):
            nums[i] = 2