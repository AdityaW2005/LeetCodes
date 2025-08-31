class Solution:
    def searchRange(self, nums: list[int], target: int) -> list[int]:
        def findLeft():
            lo, hi = 0, len(nums) - 1
            idx = -1
            while lo <= hi:
                mid = (lo + hi) // 2
                if nums[mid] >= target:
                    hi = mid - 1
                else:
                    lo = mid + 1
                if nums[mid] == target:
                    idx = mid
            return idx
        
        def findRight():
            lo, hi = 0, len(nums) - 1
            idx = -1
            while lo <= hi:
                mid = (lo + hi) // 2
                if nums[mid] <= target:
                    lo = mid + 1
                else:
                    hi = mid - 1
                if nums[mid] == target:
                    idx = mid
            return idx
        
        return [findLeft(), findRight()]
