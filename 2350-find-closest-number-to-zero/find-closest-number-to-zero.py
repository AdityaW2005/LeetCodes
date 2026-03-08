class Solution:
    def findClosestNumber(self, nums: List[int]) -> int:
        closest_num = nums[0]
        
        for i in nums:
            if abs(i) < abs(closest_num):
                closest_num = i
            elif abs(i) == abs(closest_num) and i > closest_num:
                closest_num = i
        
        return closest_num