class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        # if not nums:
        #     return 0
        
        # s = set(nums)
        # longest = 0
        
        # for num in s:
        #     if num - 1 not in s:
        #         current = num
        #         length = 1
                
        #         while current + 1 in s:
        #             current += 1
        #             length += 1
                
        #         longest = max(longest, length)
        
        # return longest

        nums.sort()
        n = len(nums)
        if n == 0:
            return 0
        count, longest, lastSmallest = 1, 1, nums[0]

        for i in range(1, n):
            if nums[i] == lastSmallest + 1:
                count += 1
                lastSmallest = nums[i]
            
            elif nums[i] != lastSmallest:
                count = 1
                lastSmallest = nums[i]
            
            longest = max(longest, count)
        
        return longest
