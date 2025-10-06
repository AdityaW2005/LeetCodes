class Solution:
    def targetIndices(self, nums: List[int], target: int) -> List[int]:
        l = []
        for i in range(len(nums)):
            if sorted(nums)[i] == target:
                l.append(i)
        return l