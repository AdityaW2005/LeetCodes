class Solution:
    def arraySign(self, nums: List[int]) -> int:
        def signFunc(x):
            if x == 0:
                return 0
            elif x > 0:
                return 1
            else:
                return -1
        prod = 1
        for i in nums:
            if i == 0:
                prod = 0
                break
            prod *= i
        return signFunc(prod)
        