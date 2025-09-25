class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        sets = set(nums)
        if len(sets) <= 2:
            return max(sets)
        else:
            for i in range(2):
                sets.remove(max(sets))
            return max(sets)