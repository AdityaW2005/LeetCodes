class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        n = len(nums)
        closest_sum = float('inf')

        for i in range(n):
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            low, high = i + 1, n - 1

            while low < high:
                curr_sum = nums[i] + nums[low] + nums[high]

                if abs(curr_sum - target) < abs(closest_sum - target):
                    closest_sum = curr_sum
                
                if curr_sum == target:
                    return curr_sum
                elif curr_sum < target:
                    low += 1
                else:
                    high -= 1
            
        return closest_sum