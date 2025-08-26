class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        x = nums.copy()  # Create actual copy instead of reference
        i = 0
        # Use while loop to handle dynamic list size during popping
        while i < len(nums) - 1:
            if i + 1 < len(nums) and nums[i] == nums[i + 1]:  # Check for duplicates
                nums.pop(i + 1)  # Remove the duplicate (next element)
            else:
                i += 1
        return len(nums)  # Return new length as required by LeetCode 26
