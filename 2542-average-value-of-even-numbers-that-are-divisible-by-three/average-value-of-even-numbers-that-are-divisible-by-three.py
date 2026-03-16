class Solution:
    def averageValue(self, nums: List[int]) -> int:
        avg = []
        for i in nums:
            if i % 6 == 0:
                avg.append(i)
        
        if len(avg) == 0:
            return 0
        return int(sum(avg) / len(avg))