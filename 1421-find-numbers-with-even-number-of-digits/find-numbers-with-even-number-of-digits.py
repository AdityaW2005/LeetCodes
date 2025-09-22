class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        l = []
        for i in nums:
            count = 0
            while i > 0:
                i //= 10
                count += 1
            l.append(count)
        count = 0
        for i in l:
            if i % 2 == 0:
                count += 1
        return count