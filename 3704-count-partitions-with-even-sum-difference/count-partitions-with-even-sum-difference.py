class Solution:
    def countPartitions(self, nums: List[int]) -> int:
        # Brute - Force Solution

        """
        n = len(nums)
        count = 0
        totalSum = []
        for i in range(n - 1):
            sumValue1 = 0
            sumValue2 = 0
            for l in range(0, i + 1):
                sumValue1 += nums[l]
            for r in range(i + 1, n):
                sumValue2 += nums[r]
            totalSum.append(sumValue1 - sumValue2)
        
        for i in totalSum:
            if (i % 2 == 0):
                count += 1

        return count
        """

        # Optimized Solution

        total = sum(nums)
        n = len(nums)
        if (total % 2 != 0):
            return 0
        return n - 1
        