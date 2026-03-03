class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        # Brute - Force Approach
        """
        squared_array = []

        for i in nums:
            squared_array.append(i * i)
        squared_array.sort()

        return squared_array
        """

        # Two Pointer Approach
        left = 0
        right = len(nums) - 1
        squared_array = []

        while left <= right:
            if abs(nums[left]) > abs(nums[right]):
                squared_array.append(nums[left] ** 2)
                left += 1
            else:
                squared_array.append(nums[right] ** 2)
                right -= 1
        
        squared_array.reverse()
        
        return squared_array
        