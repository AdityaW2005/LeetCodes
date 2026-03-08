class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        prod_array = [1] * n

        # Left Products
        left = 1
        for i in range(n):
            prod_array[i] = left
            left *= nums[i]
        
        # Right Products
        right = 1
        for i in range(n - 1, -1, -1):
            prod_array[i] *= right
            right *= nums[i]
        
        return prod_array