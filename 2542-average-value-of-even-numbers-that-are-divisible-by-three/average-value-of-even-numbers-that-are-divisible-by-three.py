class Solution:
    def averageValue(self, nums: List[int]) -> int:
        avg = [x for x in nums if x % 6 == 0]

        return sum(avg) // len(avg) if len(avg) != 0 else 0