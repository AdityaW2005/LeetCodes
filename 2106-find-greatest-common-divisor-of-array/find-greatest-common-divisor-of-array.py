class Solution:
    def findGCD(self, nums: List[int]) -> int:
        def gcd(a, b):
            if a == 0:
                return b
            return gcd(b % a, a)
        a = max(nums)
        b = min(nums)
        return gcd(a, b)