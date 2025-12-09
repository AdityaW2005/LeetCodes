class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        dic = {}
        for i, x in enumerate(nums):
            if x in dic and i - dic[x] <= k:
                return True
            dic[x] = i
        return False
        