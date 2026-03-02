class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        s = set(nums)
        longest = 0
        
        for num in s:
            if num - 1 not in s:
                current = num
                length = 1
                
                while current + 1 in s:
                    current += 1
                    length += 1
                
                longest = max(longest, length)
        
        return longest
