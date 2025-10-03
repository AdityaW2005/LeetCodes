class Solution:
    def checkPrimeFrequency(self, nums: List[int]) -> bool:
        l = []
        def is_prime(n):
            if n <= 1:
                return False
            for i in range(2, int(n ** 0.5) + 1):
                if n % i == 0:
                    return False
            return True
        for i in nums:
            l.append(nums.count(i))
        for i in l:
            if is_prime(i):
                return True
        return False