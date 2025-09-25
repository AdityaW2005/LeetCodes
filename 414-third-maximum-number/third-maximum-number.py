class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        set_nums = set(nums)
        
        if len(set_nums) < 3:
            return max(set_nums)
        else:
            for _ in range(2):
                set_nums.remove(max(set_nums))
            return max(set_nums)